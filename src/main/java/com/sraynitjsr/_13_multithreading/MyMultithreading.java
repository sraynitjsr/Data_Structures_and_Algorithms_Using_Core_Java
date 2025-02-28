package com.sraynitjsr._13_multithreading;

public class MyMultithreading {
    public static void start() throws Exception {
        System.out.println("\n**** Inside Multithreading Module ****");
        Thread1.start();
        Thread2.start();
        Thread3.start();
        Thread4_Synchronization_OddEven.start();
        MyCountDownLatch.start();
    }
}
