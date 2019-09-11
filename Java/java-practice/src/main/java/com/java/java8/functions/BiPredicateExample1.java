package com.java.java8.functions;

import java.util.function.BiPredicate;

public class BiPredicateExample1 {

    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (a, b) -> {
            return a.contains("a") && b > 10;
        };
        System.out.println(biPredicate.test("america", 12));
        System.out.println(biPredicate.test("america", 8));
        System.out.println(biPredicate.test("computer", 3));
    }

}
