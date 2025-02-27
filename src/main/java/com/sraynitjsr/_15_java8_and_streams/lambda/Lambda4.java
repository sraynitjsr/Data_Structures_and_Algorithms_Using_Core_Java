package com.sraynitjsr._15_java8_and_streams.lambda;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Lambda4 {
    public static void start() {
        List<String> items = Arrays.asList("apple", "banana", "apple", "grape", "orange", "banana", "grape", "apple", "banana", "apple");

        System.out.println("List is => " + items);

        System.out.println("\nFrequency of Each String");
        System.out.println(items.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())));

        System.out.println("\nPrint Only Those Whose Frequency is More Than 2");
        items.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() > 2).forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
    }
}
