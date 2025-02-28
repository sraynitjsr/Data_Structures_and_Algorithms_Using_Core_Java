package com.sraynitjsr._13_multithreading;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatch {
    public static void start() {
        System.out.println("\nCountDownLatch Using Java");

        int threadCount = 3;
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            int threadNum = i + 1;
            new Thread(() -> {
                System.out.println("Thread " + threadNum + " is running");
                latch.countDown();
                System.out.println("Thread " + threadNum + " finished its task");
            }).start();
        }

        try {
            System.out.println("Waiting for all threads to finish...");
            latch.await();
            System.out.println("All threads completed. Proceeding further.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
