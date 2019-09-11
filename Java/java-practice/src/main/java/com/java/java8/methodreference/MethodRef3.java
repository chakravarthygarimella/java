package com.java.java8.methodreference;

import java.util.function.BiConsumer;

public class MethodRef3 {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> adder = MethodRef3::add;
        adder.accept(10, 23);

    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

}
