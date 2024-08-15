package com.game_brain.game_brain.entity.particle;

import com.game_brain.game_brain.engine.Engine;
import com.game_brain.game_brain.entity.shape.primitive.Oval;
import com.game_brain.game_brain.util.pool.Pool;
import com.game_brain.game_brain.util.pool.SafeFixedObjectPool;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class OvalParticleSystem extends GenericParticleSystem {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public OvalParticleSystem(Engine engine, int width, int height, int minCount) {
        this(engine, width, height, minCount, minCount);
    }

    public OvalParticleSystem(Engine engine, int width, int height, int minCount, int maxCount) {
        super(engine, new SafeFixedObjectPool<>(new Pool.PoolObjectFactory<Particle>() {
            @Override
            public Particle createObject() {
                return new GenericParticle<>(engine, new Oval(engine, width, height));
            }
        }, minCount, maxCount));
    }
    //========================================================

}
