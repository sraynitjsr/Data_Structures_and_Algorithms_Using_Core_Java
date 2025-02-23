package com.sraynitjsr._15_java8_and_streams.lambda;

interface MyFunctionalInterface {
    void functionalInterfaceMethod();
    default void defaultMethodA() {
        System.out.println("Default Method A");
    }
    static void staticMethodA() {
        System.out.println("Static Method A");
    }
}

class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
    public void functionalInterfaceMethod() {
        System.out.println("Traditional Way");
    }
}

public class Lambda1 {
    public static void traditionalWay() {
        new MyFunctionalInterfaceImpl().functionalInterfaceMethod();
    }
    public static void lambdaWay() {
        MyFunctionalInterface lambda = () -> {
            System.out.println("Lambda Way");
        };
        lambda.functionalInterfaceMethod();
    }
    public static void start() {
        traditionalWay();
        lambdaWay();
    }
}
