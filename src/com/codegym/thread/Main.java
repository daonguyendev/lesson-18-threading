package com.codegym.thread;

public class Main {

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.run();
    }
}
