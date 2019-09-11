package com.java.java8.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        BiConsumer<Integer, String> biCons = (a, b) -> {
            System.out.println("key is " + a + " value is " + b);
        };
        map.forEach(biCons);
    }
}
