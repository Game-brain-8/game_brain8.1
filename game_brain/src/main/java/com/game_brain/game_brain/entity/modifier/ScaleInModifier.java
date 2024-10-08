package com.game_brain.game_brain.entity.modifier;

import com.game_brain.game_brain.util.modifier.tween.Tweener;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class ScaleInModifier extends ScaleModifier {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public ScaleInModifier(long duration) {
        super(0, 1, duration);
    }

    public ScaleInModifier(long duration, long startDelay) {
        super(0, 1, duration, startDelay);
    }

    public ScaleInModifier(long duration, Tweener tweener) {
        super(0, 1, duration, tweener);
    }

    public ScaleInModifier(long duration, long startDelay, Tweener tweener) {
        super(0, 1, duration, startDelay, tweener);
    }
    //========================================================

}
