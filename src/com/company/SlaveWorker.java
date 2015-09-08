package com.company;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class SlaveWorker extends AbstractWorker {
    public SlaveWorker(State state) {
        super(state);
    }

    @Override
    public void run() {
        boolean logged = false;
        long nextPing = System.currentTimeMillis() + 30000;

        while (isKeepRunning()) {
            long value = getValue();
            if (nextPing < System.currentTimeMillis()) {
                print("Still running " + value);
                nextPing = System.currentTimeMillis() + 10000;
            }
            if (value % 10000 == 0) {
                if (logged) {
                    continue;
                }
                print("value: " + value);
                logged = true;
            } else {
                logged = false;
            }
            nextPing = System.currentTimeMillis() + 30000;
        }
        print("FINISHED");
    }
}
