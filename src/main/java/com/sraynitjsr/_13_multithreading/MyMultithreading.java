package com.sraynitjsr._13_multithreading;

public class MyMultithreading {
    public static void start() throws Exception {
        System.out.println("\n**** Inside Multithreading Module ****");

        // Five-Second Sleep Given So That One Program's Output Does Not Impact Other One, These Are Independent Examples

        Thread1.start();
        Thread.sleep(5000);

        Thread2.start();
        Thread.sleep(5000);

        Thread3.start();
        Thread.sleep(5000);

        Thread4.start();
        Thread.sleep(5000);

        Thread5.start();
        Thread.sleep(5000);
    }
}
