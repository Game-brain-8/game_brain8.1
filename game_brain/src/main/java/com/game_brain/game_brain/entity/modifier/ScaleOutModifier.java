package com.game_brain.game_brain.entity.modifier;

import com.game_brain.game_brain.util.modifier.tween.Tweener;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class ScaleOutModifier extends ScaleModifier {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public ScaleOutModifier(long duration) {
        super(1, 0, duration);
    }

    public ScaleOutModifier(long duration, long startDelay) {
        super(1, 0, duration, startDelay);
    }

    public ScaleOutModifier(long duration, Tweener tweener) {
        super(1, 0, duration, tweener);
    }

    public ScaleOutModifier(long duration, long startDelay, Tweener tweener) {
        super(1, 0, duration, startDelay, tweener);
    }
    //========================================================

}
