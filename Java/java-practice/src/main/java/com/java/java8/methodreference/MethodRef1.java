package com.java.java8.methodreference;

import com.java.java8.interfaces.Sayable;

/*
 * There are following types of method references in java:
 * Reference to a static method.
 * Reference to an instance method. 
 * Reference to a constructor.
 */
public class MethodRef1 {
    public static void main(String[] args) {
        Sayable sayable = MethodRef1::saySomething;
        sayable.say();
    }

    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

}
