package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        State state = new State();
        for (int i = 0; i < 100; i++) {
            new Thread(new SlaveWorker(state), "slave-" + i).start();
        }
        new Thread(new MasterWorker(state), "master").start();
    }




}
