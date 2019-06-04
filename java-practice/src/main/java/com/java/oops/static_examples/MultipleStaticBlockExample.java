package com.java.oops.static_examples;

public class MultipleStaticBlockExample {
    
    static int count;
    static String name;
    
    static {
        count =10;
        name = "java";
    }
    
    static {
        count = 20;
        name = "spring";
    }

    public static void main(String[] args) {
        System.out.println(count);
        System.out.println(name);
    }

}
