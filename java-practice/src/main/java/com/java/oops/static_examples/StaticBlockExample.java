package com.java.oops.static_examples;

public class StaticBlockExample {
    static int a ;
    static String name;
    
    static {
        a=100;
        name="java";
    }
    
    public static void main(String[] args) {
        System.out.println("The value of static block variable a: " +a);
        System.out.println("The value of the static block variable name: "+name);
    }

}
