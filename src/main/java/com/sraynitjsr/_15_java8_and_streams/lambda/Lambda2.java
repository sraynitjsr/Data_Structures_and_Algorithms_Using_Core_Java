package com.sraynitjsr._15_java8_and_streams.lambda;

interface MyFunctionalInterfaceTwo {
    String greater(int a, int b);
    static void display() {
        System.out.println("Static Method of This Interface, For Now, I Won't Use This");
    }
    default void displayDefault() {
        System.out.println("Again, This Also I Won't Use For Now");
    }
}

public class Lambda2 {
    public static void traditionalWay() {
        System.out.println("Not Implementing Traditional Way, Let's Go Lambda Way Only");
    }
    public static void lambdaWay() {
        MyFunctionalInterfaceTwo lambdaTwo = (a, b) -> {
            if (a > b) {
                return "A is greater";
            } else {
                return  "B is greater";
            }
        };
        System.out.println(lambdaTwo.greater(20, 30));;
        System.out.println(lambdaTwo.greater(30, 20));;
    }
    public static void start() {
        traditionalWay();
        lambdaWay();
    }
}
