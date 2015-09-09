package com.company;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class SlaveWorker implements Runnable {
    private final State state;

    public SlaveWorker(State state) {
        this.state = state;
    }

    @Override
    public void run() {
        long nextPing = System.currentTimeMillis() + 40000;

        while (state.isKeepRunning()) {
            if (nextPing < System.currentTimeMillis()) {
                Logger.log("Still running ");
                nextPing = System.currentTimeMillis() + 10000;
            }
        }
        Logger.log("FINISHED");
    }
}
