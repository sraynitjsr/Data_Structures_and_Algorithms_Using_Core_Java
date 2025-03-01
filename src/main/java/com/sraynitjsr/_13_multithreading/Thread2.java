package com.sraynitjsr._13_multithreading;

class MyClass2 implements Runnable {
    public void run() {
        System.out.println("Implementing Runnable Interface");
    }
}

public class Thread2 {
    public static void start() {
        System.out.println("\nMultithreading Example 2, Implementing Runnable Interface");
        MyClass2 obj = new MyClass2();
        Thread t = new Thread(obj);
        t.start();
    }
}
