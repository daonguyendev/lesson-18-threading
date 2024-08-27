package com.codegym.runningcar;

public class Main {
    public static int DISTANCE = 100;

    public static int STEP = 2;

    public static void main(String[] args) {
        //Create tasks
        Car carA = new Car("Mr.Trung");
        Car carB = new Car("Mr.Hoang");
        Car carC = new Car("Mr.Linh");
        Car carD = new Car("Mr.Hieu");
        Car carE = new Car("Mr.Khang");
        Car carF = new Car("Mr.Tan");

        //Create threads
        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);
        Thread thread4 = new Thread(carD);
        Thread thread5 = new Thread(carE);
        Thread thread6 = new Thread(carF);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
