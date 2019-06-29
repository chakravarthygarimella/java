package com.java.corejava.string;

public class EqualsMethodExample {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hell";
        String str3 = "hello";
        String str4 = "HELLo";

        System.out.println("-----Equals method------");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("-----EqualsIgnore method------");
        System.out.println(str1.equalsIgnoreCase(str4));
    }

}
