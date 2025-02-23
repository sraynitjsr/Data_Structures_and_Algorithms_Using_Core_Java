package com.sraynitjsr._15_java8_and_streams.lambda;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Lambda3_HashMap_Sorting {
    public static void sortByKey(HashMap<String, Integer> myHashMap) {
        System.out.println("\nSorting by Key Using Lambda and Stream");

        System.out.println("Ascending Order");
        myHashMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.print(entry.getKey() + "_" + entry.getValue() + " "));
        System.out.println();

        System.out.println("Descending Order");
        myHashMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
                .forEach(entry -> System.out.print(entry.getKey() + "_" + entry.getValue() + " "));
        System.out.println();
    }

    public static void sortByValue(HashMap<String, Integer> myHashMap) {
        System.out.println("\nSorting by Value Using Lambda and Stream");

        System.out.println("Ascending Order");
        myHashMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.print(entry.getKey() + "_" + entry.getValue() + " "));
        System.out.println();

        System.out.println("Descending Order");
        myHashMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(entry -> System.out.print(entry.getKey() + "_" + entry.getValue() + " "));
        System.out.println();
    }

    public static void start() {
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Five", 5);
        myHashMap.put("Two", 2);
        myHashMap.put("One", 1);
        myHashMap.put("Four", 4);
        myHashMap.put("Three", 3);
        sortByKey(myHashMap);
        sortByValue(myHashMap);
    }
}
