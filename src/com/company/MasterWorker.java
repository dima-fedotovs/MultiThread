package com.company;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class MasterWorker extends AbstractWorker {
    public MasterWorker(State state) {
        super(state);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            long value = getValue() + 1;
            setValue(value);
            if (value % 10000000 == 0) {
                print("value: " + value);
            }
        }
        print("FINISHED");
        stopRunning();
    }

}
