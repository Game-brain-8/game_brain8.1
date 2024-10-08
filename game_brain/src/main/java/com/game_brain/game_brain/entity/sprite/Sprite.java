package com.game_brain.game_brain.entity.sprite;

import android.graphics.Canvas;

import com.game_brain.game_brain.engine.Engine;
import com.game_brain.game_brain.entity.shape.RectangleShapeEntity;
import com.game_brain.game_brain.texture.Texture;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class Sprite extends RectangleShapeEntity {

    protected Texture mTexture;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Sprite(Engine engine, Texture texture) {
        this(engine, 0, 0, texture);
    }

    public Sprite(Engine engine, float x, float y, Texture texture) {
        super(engine, x, y, texture.getWidth(), texture.getHeight());
        mTexture = texture;
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public Texture getTexture() {
        return mTexture;
    }

    public void setTexture(Texture texture) {
        mTexture = texture;
        setWidth(mTexture.getWidth());
        setHeight(mTexture.getHeight());
        resetScalePivot();
        resetRotationPivot();
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void onDrawCanvas(Canvas canvas) {
        canvas.drawBitmap(mTexture.getBitmap(), 0, 0, mPaint);
    }
    //========================================================

}
