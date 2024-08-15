package com.game_brain.game_brain.input.touch;

import com.game_brain.game_brain.camera.Camera;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface BoundTouchEventListener {

    default Camera.CoordinateType getCoordinateType() {
        return Camera.CoordinateType.WORLD;
    }

    float getX();

    float getY();

    float getEndX();

    float getEndY();

    void onBoundTouchEvent(int type, float relativeTouchX, float relativeTouchY);

}
