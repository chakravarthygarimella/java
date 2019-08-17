package com.java.oops.polymorphism;

/**
 * 
 * @author Chakravarthy Garimella
 * May 21, 2019
 *
 */
public class StaticPolymorphism {
    
    /**
     * Static polymorphism: 
     * Method overloading is the example of polymorphism having same method name and having different no of arguments that 
     * we are passing to that method
     * @param a
     * @param b
     */
    public void add(int a, int b) {
        System.out.println("Two argument addition: "+(a+b));
    }
    
    public void add(int a, int b, int c) {
        System.out.println("Three argument addition: "+(a+b+c));
    }

}
