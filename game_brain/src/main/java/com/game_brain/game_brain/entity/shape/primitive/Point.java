package com.game_brain.game_brain.entity.shape.primitive;

import android.graphics.Canvas;

import com.game_brain.game_brain.camera.Camera;
import com.game_brain.game_brain.engine.Engine;
import com.game_brain.game_brain.entity.shape.ShapeEntity;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class Point extends ShapeEntity {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Point(Engine engine, float x, float y) {
        super(engine, x, y);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public boolean isCulling(Canvas canvas, Camera camera) {
        return camera.getWorldToScreenX(mX, mCoordinateType) > canvas.getWidth()
                || camera.getWorldToScreenY(mY, mCoordinateType) > canvas.getHeight()
                || camera.getWorldToScreenX(mX, mCoordinateType) < 0
                || camera.getWorldToScreenY(mY, mCoordinateType) < 0;
    }

    @Override
    protected void onDrawCanvas(Canvas canvas) {
        canvas.drawPoint(0, 0, mPaint);
    }
    //========================================================

}
