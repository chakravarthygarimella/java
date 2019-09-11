package com.java.java8.functions;

import java.util.function.BiFunction;

public class BiFunctionExample1 {

    public static void main(String[] args) {

        // It takes 3 arguments (arg1, arg2, return type of result)
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> (a + b);
        System.out.println(biFunction.apply(10, 20));

        // andThen method
        biFunction = biFunction.andThen(b -> b * 2);
        System.out.println(biFunction.apply(2, 3));
    }

}
