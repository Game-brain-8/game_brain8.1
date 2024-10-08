package com.game_brain.game_brain.entity.sprite;

import android.graphics.Canvas;

import com.game_brain.game_brain.camera.Camera;
import com.game_brain.game_brain.engine.Engine;
import com.game_brain.game_brain.texture.Texture;
import com.game_brain.game_brain.texture.TextureGroup;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class FrameSprite extends Sprite {

    protected TextureGroup<? extends Texture> mTextureGroup;
    protected int mCurrentFrameIndex;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public FrameSprite(Engine engine, TextureGroup<? extends Texture> textureGroup) {
        this(engine, 0, 0, textureGroup, 0);
    }

    public FrameSprite(Engine engine, TextureGroup<? extends Texture> textureGroup, int startFrameIndex) {
        this(engine, 0, 0, textureGroup, startFrameIndex);
    }

    public FrameSprite(Engine engine, float x, float y, TextureGroup<? extends Texture> textureGroup) {
        this(engine, x, y, textureGroup, 0);
    }

    public FrameSprite(Engine engine, float x, float y, TextureGroup<? extends Texture> textureGroup, int startFrameIndex) {
        super(engine, x, y, textureGroup.getTextures().get(startFrameIndex));
        mTextureGroup = textureGroup;
        mCurrentFrameIndex = startFrameIndex;
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public TextureGroup<? extends Texture> getTextureGroup() {
        return mTextureGroup;
    }

    public void setTextureGroup(TextureGroup<? extends Texture> textureGroup) {
        mTextureGroup = textureGroup;
    }

    public int getCurrentFrameIndex() {
        return mCurrentFrameIndex;
    }

    public void setCurrentFrameIndex(int currentFrameIndex) {
        mCurrentFrameIndex = currentFrameIndex;
    }

    public int getFrameCount() {
        return mTextureGroup.getTextureCount();
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void onPreDraw(Canvas canvas, Camera camera) {
        mTexture = mTextureGroup.getTextures().get(mCurrentFrameIndex);
    }

    @Override
    public void reset() {
        super.reset();
        mTexture = mTextureGroup.getTextures().get(mCurrentFrameIndex);
    }
    //========================================================

}
