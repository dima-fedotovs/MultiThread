package com.company;

public class Main {

    public static void main(String[] args) {
        State state = new State();

        for (int i = 0; i < 100; i++) {
            SlaveWorker slave = new SlaveWorker(state);
            new Thread(slave, "slave-" + i).start();
        }

        MasterWorker master = new MasterWorker(state);
        new Thread(master, "master").start();
    }

}
