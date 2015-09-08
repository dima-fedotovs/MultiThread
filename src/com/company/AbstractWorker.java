package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public abstract class AbstractWorker implements Runnable {
    private final State state;

    public AbstractWorker(State state) {
        this.state = state;
    }

    public boolean isKeepRunning() {
        return state.isKeepRunning();
    }

    public void stopRunning() {
        state.setKeepRunning(false);
    }

    public long getValue() {
        return state.getValue();
    }

    public void setValue(long value) {
        state.setValue(value);
    }

    protected void print(String msg) {
        long time = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + ": time: " + time + "; " + msg);
    }
}
