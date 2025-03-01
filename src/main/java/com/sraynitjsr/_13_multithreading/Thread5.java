package com.sraynitjsr._13_multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A implements Runnable {
    private final CountDownLatch latch;
    A(CountDownLatch latch) {
        this.latch = latch;
    }
    public void run() {
        System.out.println("Inside Class A");
        latch.countDown();
    }
}

class B implements Runnable {
    private final CountDownLatch latch;
    B(CountDownLatch latch) {
        this.latch = latch;
    }
    public void run() {
        System.out.println("Inside Class B");
        latch.countDown();
    }
}

class C implements Runnable {
    private final CountDownLatch latch;
    C(CountDownLatch latch) {
        this.latch = latch;
    }
    public void run() {
        System.out.println("Inside Class C");
        latch.countDown();
    }
}

public class Thread5 {
    public static void start() throws Exception {
        System.out.println("\nMultithreading Example 5, Count Down Latch Along with Executor Framework");

        int useCaseCount = 3;
        CountDownLatch latch = new CountDownLatch(useCaseCount);

        ExecutorService executor = Executors.newFixedThreadPool(useCaseCount);

        executor.submit(new A(latch));
        executor.submit(new B(latch));
        executor.submit(new C(latch));

        latch.await();

        executor.shutdown();

        System.out.println("All threads have finished their work.");
    }
}
