package com.sraynitjsr._15_java8_and_streams.lambda;

public class MyLambdaExpressions {
    public static void start() {
        System.out.println("Let's Play With Lambda Expressions First");

        System.out.println("\nLambda Type A, No Parameters");
        Lambda1.start();

        System.out.println("\nLambda Type B, With Parameters");
        Lambda2.start();

        System.out.println("\nSorting HashMap Using Lambda Expression");
        Lambda3_HashMap_Sorting.start();
    }
}
