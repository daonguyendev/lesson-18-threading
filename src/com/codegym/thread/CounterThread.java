package com.codegym.thread;

public class CounterThread extends Thread {

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Count: " + i);
            // Dừng vòng lặp trong 1000 ms
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
