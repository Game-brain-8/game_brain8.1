package com.game_brain.game_brain.entity.modifier;

import com.game_brain.game_brain.util.modifier.tween.Tweener;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class FadeInModifier extends AlphaModifier {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public FadeInModifier(long duration) {
        super(0, 255, duration);
    }

    public FadeInModifier(long duration, long startDelay) {
        super(0, 255, duration, startDelay);
    }

    public FadeInModifier(long duration, Tweener tweener) {
        super(0, 255, duration, tweener);
    }

    public FadeInModifier(long duration, long startDelay, Tweener tweener) {
        super(0, 255, duration, startDelay, tweener);
    }
    //========================================================

}
