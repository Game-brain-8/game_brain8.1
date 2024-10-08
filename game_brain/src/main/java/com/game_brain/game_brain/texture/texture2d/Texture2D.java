package com.game_brain.game_brain.texture.texture2d;

import android.graphics.Bitmap;

import com.game_brain.game_brain.texture.BaseTexture;
import com.game_brain.game_brain.texture.TextureFormat;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class Texture2D extends BaseTexture {

    private final Bitmap mBitmap;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Texture2D(Texture2DManager texture2DManager, TextureFormat format, Bitmap bitmap) {
        super(texture2DManager, format);
        mBitmap = bitmap;
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    @Override
    public Bitmap getBitmap() {
        return mBitmap;
    }

    @Override
    public int getWidth() {
        return mBitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return mBitmap.getHeight();
    }

    @Override
    public void release() {
        mBitmap.recycle();
        getParent().removeTexture(this);
    }

    @Override
    protected Texture2DManager getParent() {
        return (Texture2DManager) super.getParent();
    }
    //========================================================


}
