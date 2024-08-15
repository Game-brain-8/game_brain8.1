package com.game_brain.game_brain.entity.sprite;

import com.game_brain.game_brain.engine.Engine;
import com.game_brain.game_brain.input.touch.BoundTouchEventListener;
import com.game_brain.game_brain.input.touch.TouchEvent;
import com.game_brain.game_brain.input.touch.TouchEventListener;
import com.game_brain.game_brain.texture.Texture;
import com.game_brain.game_brain.texture.TextureGroup;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class ButtonSprite extends FrameSprite implements BoundTouchEventListener, TouchEventListener {

    private ButtonListener mListener;
    private ButtonState mState = ButtonState.ENABLE;

    public enum ButtonState {
        ENABLE,
        PRESSED,
        DISABLE
    }

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public ButtonSprite(Engine engine, TextureGroup<? extends Texture> textureGroup) {
        super(engine, textureGroup);
    }

    public ButtonSprite(Engine engine, float x, float y, TextureGroup<? extends Texture> textureGroup) {
        super(engine, x, y, textureGroup);
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public ButtonListener getButtonListener() {
        return mListener;
    }

    public void setButtonListener(ButtonListener listener) {
        mListener = listener;
    }

    public ButtonState getButtonState() {
        return mState;
    }

    public void setButtonState(ButtonState state) {
        mState = state;
        onUpdateButtonState();
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void onBoundTouchEvent(int type, float relativeTouchX, float relativeTouchY) {
        if (mState == ButtonState.DISABLE) {
            return;
        }
        if (type == TouchEvent.TOUCH_DOWN) {
            mState = ButtonState.PRESSED;
            onUpdateButtonState();
        }
    }

    @Override
    public void onTouchEvent(int type, float touchX, float touchY) {
        if (mState == ButtonState.DISABLE) {
            return;
        }
        // Check the touch up event when pressed state to prevent
        // pressing the button in bounds and release somewhere else
        if (type == TouchEvent.TOUCH_UP && mState == ButtonState.PRESSED) {
            mState = ButtonState.ENABLE;
            onUpdateButtonState();
        }
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    protected void onUpdateButtonState() {
        if (mListener == null) {
            return;
        }
        switch (mState) {
            case ENABLE:
                setCurrentFrameIndex(0);
                mListener.onEnableButton(this);
                break;
            case PRESSED:
                if (getFrameCount() >= 2) {
                    setCurrentFrameIndex(1);
                }
                mListener.onPressedButton(this);
                break;
            case DISABLE:
                if (getFrameCount() >= 3) {
                    setCurrentFrameIndex(2);
                }
                mListener.onDisableButton(this);
                break;
        }
    }
    //========================================================

    //--------------------------------------------------------
    // Inner Classes
    //--------------------------------------------------------
    public interface ButtonListener {

        void onEnableButton(ButtonSprite button);

        void onDisableButton(ButtonSprite button);

        void onPressedButton(ButtonSprite button);

    }
    //========================================================

}
