package com.java.java8.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiunctionExample2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        BiFunction<String, String, List<String>> biFun = (a, b) -> {
            list.add(a);
            list.add(b);
            return list;
        };
        // adding two strings
        System.out.println(biFun.apply("string1", "string2"));
    }
}
