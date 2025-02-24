package com.sraynitjsr._13_multithreading;

class MyClass3 implements Runnable {
    public void run() {
        System.out.println("Inside My Class 3, Runnable Interface");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing i => " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread3 {
    public static void start() throws Exception {
        MyClass3 obj = new MyClass3();
        Thread t1 = new Thread(obj);
        t1.start();
        t1.join();
        System.out.println("Thread Execution Done");
    }
}
