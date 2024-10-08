package com.game_brain.game_brain.util.debug;

import com.game_brain.game_brain.camera.Camera;
import com.game_brain.game_brain.engine.Engine;
import com.game_brain.game_brain.engine.EngineListener;
import com.game_brain.game_brain.entity.Updatable;
import com.game_brain.game_brain.entity.text.Text;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class EntityCounter extends Text implements EngineListener {

    private int mEntityCount;

    private final StringBuilder mStringBuilder = new StringBuilder();
    private final Map<String, Integer> mEntityCountMap = new HashMap<>();

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public EntityCounter(Engine engine, int width, int height) {
        this(engine, 0, 0, width, height);
    }

    public EntityCounter(Engine engine, float x, float y, int width, int height) {
        super(engine, x, y, width, height);
        engine.addListener(this);
        setCoordinateType(Camera.CoordinateType.CAMERA);
        setPaint(engine.getDebugger().getDebugTextPaint());
        setTextHorizontalAlign(TextHorizontalAlign.LEFT);
        setTextVerticalAlign(TextVerticalAlign.TOP);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void onAddToEngine(Updatable updatable) {
        mEntityCount++;
        String name = updatable.getName();
        if (!mEntityCountMap.containsKey(name)) {
            mEntityCountMap.put(name, 1);
        } else {
            int currentCount = mEntityCountMap.get(name);
            mEntityCountMap.put(name, currentCount + 1);
        }
    }

    @Override
    public void onRemoveFromEngine(Updatable updatable) {
        mEntityCount--;
        String name = updatable.getName();
        if (mEntityCountMap.containsKey(name)) {
            int currentCount = mEntityCountMap.get(name) - 1;
            if (currentCount == 0) {
                mEntityCountMap.remove(name);
            } else {
                mEntityCountMap.put(name, currentCount);
            }
        }
    }

    @Override
    protected void onUpdate(long elapsedMillis) {
        mStringBuilder.delete(0, mStringBuilder.length());
        mStringBuilder.append("Total Entity: ")
                .append(mEntityCount)
                .append("\n");
        for (Map.Entry<String, Integer> name : mEntityCountMap.entrySet()) {
            mStringBuilder.append(name.getKey())
                    .append(": ")
                    .append(name.getValue())
                    .append("\n");
        }
        setText(mStringBuilder.toString());
    }
    //========================================================

}
