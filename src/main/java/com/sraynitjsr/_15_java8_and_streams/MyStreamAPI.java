package com.sraynitjsr._15_java8_and_streams;

import com.sraynitjsr._15_java8_and_streams.lambda.*;

public class MyStreamAPI {
    public static void start() {
        System.out.println("\n**** Inside Streams API ****");

        System.out.println("\nLambda Type A, No Parameters");
        Lambda1.start();

        System.out.println("\nLambda Type B, With Parameters");
        Lambda2.start();

        System.out.println("\nSorting HashMap Using Lambda Expression");
        Lambda3.start();

        System.out.println("\nCount Each String's Frequency in A List");
        Lambda4.start();
    }
}
