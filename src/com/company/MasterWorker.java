package com.company;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class MasterWorker implements Runnable {
    private final State state;

    public MasterWorker(State state) {
        this.state = state;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            if (i % 10000000 == 0) {
                Logger.log("progress: " + i);
            }
        }
        Logger.log("FINISHED");
        state.setKeepRunning(false);
    }

}
