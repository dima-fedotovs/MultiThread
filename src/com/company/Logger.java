package com.company;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Logger {

    public static void log(String message) {
        long time = System.currentTimeMillis();
        String thread = Thread.currentThread().getName();
        System.out.printf("%1$tH:%1$tM:%1$tS.%1$tL %2$s: %3$s\n", time, thread, message);
    }
}
