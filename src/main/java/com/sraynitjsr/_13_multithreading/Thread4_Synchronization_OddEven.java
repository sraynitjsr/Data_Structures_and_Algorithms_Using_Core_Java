package com.sraynitjsr._13_multithreading;

class SharedResource {
    private int count = 1;
    private String flag = "Odd";

    synchronized void printCount() {
        while (count <= 10) {
            if (flag.equals("Odd") == (count % 2 != 0)) {
                System.out.println(flag + " => " + count);
                count++;
                flag = flag.equals("Odd") ? "Even" : "Odd";
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

public class Thread4_Synchronization_OddEven {
    public static void start() {
        System.out.println("\nStarting of Odd Even Printing");
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(resource::printCount);
        Thread t2 = new Thread(resource::printCount);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of Odd Even Printing");
    }
}
