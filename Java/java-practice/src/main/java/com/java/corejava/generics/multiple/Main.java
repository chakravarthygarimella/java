package com.java.corejava.generics.multiple;

public class Main {

    public static void main(String[] args) {
        Test<String, Integer> obj = new Test<String, Integer>("chakri", 442);
        obj.print();
    }

}
