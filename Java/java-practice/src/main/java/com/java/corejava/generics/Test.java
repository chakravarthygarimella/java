package com.java.corejava.generics;

public class Test<T> {
    T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay(12);
        genericDisplay("hello");
        genericDisplay(2.55);
        genericDisplay(2L);
    }
}
