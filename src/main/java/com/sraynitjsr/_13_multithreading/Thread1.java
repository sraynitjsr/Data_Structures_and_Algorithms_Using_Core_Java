package com.sraynitjsr._13_multithreading;

class MyClass1 extends Thread {
    public void run() {
        System.out.println("Extending Thread Class");
    }
}

public class Thread1 {
    public static void start() {
        MyClass1 obj = new MyClass1();
        obj.start();
    }
}
