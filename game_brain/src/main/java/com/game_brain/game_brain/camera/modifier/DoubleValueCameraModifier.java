package com.game_brain.game_brain.camera.modifier;

import com.game_brain.game_brain.camera.Camera;
import com.game_brain.game_brain.util.modifier.DoubleValueModifier;
import com.game_brain.game_brain.util.modifier.tween.LinearTweener;
import com.game_brain.game_brain.util.modifier.tween.Tweener;

public abstract class DoubleValueCameraModifier extends DoubleValueModifier<Camera> {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected DoubleValueCameraModifier(float startValueX, float endValueX, float startValueY, float endValueY,
                                        long duration) {
        super(startValueX, endValueX, startValueY, endValueY, duration, 0, LinearTweener.getInstance());
    }

    protected DoubleValueCameraModifier(float startValueX, float endValueX, float startValueY, float endValueY,
                                        long duration, long startDelay) {
        super(startValueX, endValueX, startValueY, endValueY, duration, startDelay, LinearTweener.getInstance());
    }

    protected DoubleValueCameraModifier(float startValueX, float endValueX, float startValueY, float endValueY,
                                        long duration, Tweener tweener) {
        super(startValueX, endValueX, startValueY, endValueY, duration, 0, tweener);
    }

    protected DoubleValueCameraModifier(float startValueX, float endValueX, float startValueY, float endValueY,
                                        long duration, long startDelay, Tweener tweener) {
        super(startValueX, endValueX, startValueY, endValueY, duration, startDelay, tweener);
    }
    //========================================================

}
