package com.game_brain.game_brain.engine;

import android.graphics.Canvas;

import com.game_brain.game_brain.camera.Camera;
import com.game_brain.game_brain.entity.Updatable;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface EngineListener {

    default void onEngineUpdate(long elapsedMillis) {
    }

    default void onEngineDraw(Canvas canvas, Camera camera) {
    }

    default void onAddToEngine(Updatable updatable) {
    }

    default void onRemoveFromEngine(Updatable updatable) {
    }

}
