package com.java.corejava.generics.multiple;

public class TestGen<HQ> {

    HQ obj;

    public TestGen(HQ obj) {
        this.obj = obj;
    }

    public static <HQ> void print(HQ element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        print(12);
    }

}
