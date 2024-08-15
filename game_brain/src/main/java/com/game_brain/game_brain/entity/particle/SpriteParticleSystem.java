package com.game_brain.game_brain.entity.particle;

import com.game_brain.game_brain.engine.Engine;
import com.game_brain.game_brain.entity.sprite.Sprite;
import com.game_brain.game_brain.texture.Texture;
import com.game_brain.game_brain.util.pool.Pool;
import com.game_brain.game_brain.util.pool.SafeFixedObjectPool;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class SpriteParticleSystem extends GenericParticleSystem {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public SpriteParticleSystem(Engine engine, Texture texture, int minCount) {
        this(engine, texture, minCount, minCount);
    }

    public SpriteParticleSystem(Engine engine, Texture texture, int minCount, int maxCount) {
        super(engine, new SafeFixedObjectPool<>(new Pool.PoolObjectFactory<Particle>() {
            @Override
            public Particle createObject() {
                return new GenericParticle<>(engine, new Sprite(engine, texture));
            }
        }, minCount, maxCount));
    }
    //========================================================

}
