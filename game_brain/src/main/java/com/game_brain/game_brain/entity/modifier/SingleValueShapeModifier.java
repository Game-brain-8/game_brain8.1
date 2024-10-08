package com.game_brain.game_brain.entity.modifier;

import com.game_brain.game_brain.entity.shape.Shape;
import com.game_brain.game_brain.util.modifier.SingleValueModifier;
import com.game_brain.game_brain.util.modifier.tween.LinearTweener;
import com.game_brain.game_brain.util.modifier.tween.Tweener;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public abstract class SingleValueShapeModifier extends SingleValueModifier<Shape> {

    private boolean mIsAutoRemove = false;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected SingleValueShapeModifier(float startValue, float endValue, long duration) {
        super(startValue, endValue, duration, 0, LinearTweener.getInstance());
    }

    protected SingleValueShapeModifier(float startValue, float endValue, long duration, long startDelay) {
        super(startValue, endValue, duration, startDelay, LinearTweener.getInstance());
    }

    protected SingleValueShapeModifier(float startValue, float endValue, long duration, Tweener tweener) {
        super(startValue, endValue, duration, 0, tweener);
    }

    protected SingleValueShapeModifier(float startValue, float endValue, long duration, long startDelay, Tweener tweener) {
        super(startValue, endValue, duration, startDelay, tweener);
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public boolean isAutoRemove() {
        return mIsAutoRemove;
    }

    public void setAutoRemove(boolean autoRemove) {
        mIsAutoRemove = autoRemove;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void onEndModifier(Shape shape) {
        super.onEndModifier(shape);
        if (mIsAutoRemove) {
            shape.removeFromGame();
        }
    }
    //========================================================

}
