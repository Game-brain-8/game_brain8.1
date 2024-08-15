package com.game_brain.game_brain.input.touch;

import com.game_brain.game_brain.camera.Camera;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface TouchEventListener {

    default Camera.CoordinateType getCoordinateType() {
        return Camera.CoordinateType.WORLD;
    }

    void onTouchEvent(int type, float touchX, float touchY);

}
