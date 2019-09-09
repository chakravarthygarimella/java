package com.java.corejava.generics;

public class Main {

    public static void main(String[] args) {
        Test<String> strObj = new Test<String>("Hello");
        System.out.println(strObj.obj);

        Test<Integer> intObj = new Test<Integer>(15);
        System.out.println(intObj.obj);

    }

}
