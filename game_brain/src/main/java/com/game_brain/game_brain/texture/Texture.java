package com.game_brain.game_brain.texture;

import android.graphics.Bitmap;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface Texture {

    TextureFormat getFormat();

    Bitmap getBitmap();

    int getWidth();

    int getHeight();

    void release();

}
