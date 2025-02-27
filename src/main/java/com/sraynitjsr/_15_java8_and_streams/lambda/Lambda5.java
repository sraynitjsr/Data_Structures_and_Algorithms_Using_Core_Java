package com.sraynitjsr._15_java8_and_streams.lambda;

import java.util.*;

public class Lambda5 {
    public static void start() {
        List<Integer> salaries = Arrays.asList(60000, 75000, 50000, 80000, 75000, 90000, 80000);

        int n = 39;

        Optional<Integer> nthHighest = salaries.stream().distinct().sorted(Comparator.reverseOrder()).skip(n - 1).findFirst();

        nthHighest.ifPresentOrElse(sal -> System.out.println(n + " No. Highest Salary: " + sal), () -> System.out.println("Not enough unique salaries in the list"));
    }
}
