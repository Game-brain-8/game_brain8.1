package com.game_brain.game_brain.camera.modifier;

import com.game_brain.game_brain.camera.Camera;
import com.game_brain.game_brain.util.modifier.SingleValueModifier;
import com.game_brain.game_brain.util.modifier.tween.LinearTweener;
import com.game_brain.game_brain.util.modifier.tween.Tweener;

public abstract class SingleValueCameraModifier extends SingleValueModifier<Camera> {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected SingleValueCameraModifier(float startValue, float endValue, long duration) {
        super(startValue, endValue, duration, 0, LinearTweener.getInstance());
    }

    protected SingleValueCameraModifier(float startValue, float endValue, long duration, long startDelay) {
        super(startValue, endValue, duration, startDelay, LinearTweener.getInstance());
    }

    protected SingleValueCameraModifier(float startValue, float endValue, long duration, Tweener tweener) {
        super(startValue, endValue, duration, 0, tweener);
    }

    protected SingleValueCameraModifier(float startValue, float endValue, long duration, long startDelay, Tweener tweener) {
        super(startValue, endValue, duration, startDelay, tweener);
    }
    //========================================================

}
