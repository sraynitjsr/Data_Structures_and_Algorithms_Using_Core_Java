package com.sraynitjsr._13_multithreading;

class SharedResource {
    private int count = 1;
    private final int LIMIT = 10;

    synchronized void printOdd() {
        while (count <= LIMIT) {
            if (count % 2 != 0) {
                System.out.println(count + " from " + Thread.currentThread().getName());
                count++;
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

    synchronized void printEven() {
        while (count <= LIMIT) {
            if (count % 2 == 0) {
                System.out.println(count + " from " + Thread.currentThread().getName());
                count++;
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

class OddPrinter implements Runnable {
    SharedResource sharedResource;

    public OddPrinter(SharedResource resource) {
        this.sharedResource = resource;
    }

    public void run() {
        this.sharedResource.printOdd();
    }
}

class EvenPrinter implements Runnable {
    SharedResource sharedResource;

    public EvenPrinter(SharedResource resource) {
        this.sharedResource = resource;
    }

    public void run() {
        this.sharedResource.printEven();
    }
}

public class Thread4 {
    public static void start() {
        System.out.println("\nMultithreading Example 4, Odd Even Printing With 2 Threads");

        SharedResource resource = new SharedResource();

        OddPrinter oddPrinter = new OddPrinter(resource);
        EvenPrinter evenPrinter = new EvenPrinter(resource);

        Thread oddThread = new Thread(oddPrinter, "Thread-Odd");
        Thread evenThread = new Thread(evenPrinter, "Thread-Even");

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("End of Odd Even Printing");
    }
}
