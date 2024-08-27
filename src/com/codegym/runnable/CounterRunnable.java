package com.codegym.runnable;

public class CounterRunnable implements Runnable {

    @Override
    public void run() {
        CounterThread counter = new CounterThread();
        counter.run();

        for (int i = 10; i >= 0; i--) {
            System.out.println("Count: " + i);
            // Dừng vòng lặp trong 1000 ms
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
