package com.game_brain.game_brain.entity.shape;

import android.graphics.Paint;

import com.game_brain.game_brain.camera.Camera;
import com.game_brain.game_brain.entity.Drawable;
import com.game_brain.game_brain.entity.Updatable;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface Shape extends Updatable, Drawable {

    Camera.CoordinateType getCoordinateType();

    void setCoordinateType(Camera.CoordinateType type);

    float getX();

    void setX(float x);

    float getY();

    void setY(float y);

    float getScaleX();

    void setScaleX(float scaleX);

    float getScaleY();

    void setScaleY(float scaleY);

    void setScale(float scale);

    float getRotation();

    void setRotation(float rotation);

    int getAlpha();

    void setAlpha(int alpha);

    float getRotationPivotX();

    void setRotationPivotX(float rotationPivotX);

    float getRotationPivotY();

    void setRotationPivotY(float rotationPivotY);

    float getScalePivotX();

    void setScalePivotX(float scalePivotX);

    float getScalePivotY();

    void setScalePivotY(float scalePivotY);

    Paint getPaint();

    void setPaint(Paint paint);

}
