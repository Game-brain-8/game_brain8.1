package com.game_brain.game_brain.entity;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface Updatable {

    boolean isRunning();

    void setRunning(boolean running);

    boolean isActive();

    void setActive(boolean active);

    void addToGame();

    void removeFromGame();

    void addToScene();

    void removeFromScene();

    void update(long elapsedMillis);

    void reset();

    String getName();

}
