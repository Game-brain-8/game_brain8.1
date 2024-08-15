package com.game_brain.game_brain.entity.particle;

import com.game_brain.game_brain.engine.Engine;
import com.game_brain.game_brain.entity.shape.primitive.Circle;
import com.game_brain.game_brain.util.pool.Pool;
import com.game_brain.game_brain.util.pool.SafeFixedObjectPool;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class CircleParticleSystem extends GenericParticleSystem {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public CircleParticleSystem(Engine engine, int radius, int minCount) {
        this(engine, radius, minCount, minCount);
    }

    public CircleParticleSystem(Engine engine, int radius, int minCount, int maxCount) {
        super(engine, new SafeFixedObjectPool<>(new Pool.PoolObjectFactory<Particle>() {
            @Override
            public Particle createObject() {
                return new GenericParticle<>(engine, new Circle(engine, radius));
            }
        }, minCount, maxCount));
    }
    //========================================================

}
