package com.game_brain.game_brain.entity.particle.modifier;

import com.game_brain.game_brain.entity.particle.Particle;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface ParticleModifier {

    void updateParticle(Particle particle, long elapsedMillis);

}
