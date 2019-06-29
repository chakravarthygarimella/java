package com.java.oops.static_examples;

public class StaticVariablesExample {
    static int count = 10;
    String name;

    /**
     * static var shares single copy across all the class objects
     * @param args
     */
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        StaticVariablesExample obj1 = new StaticVariablesExample();
        StaticVariablesExample obj2 = new StaticVariablesExample();
        
        obj1.count =99;
        obj1.name = "java";
        
        obj1.count = 100;
        obj2.name = "spring and java";
        
        System.out.println("-----Object1 vars-----");
        System.out.println(obj1.count);
        System.out.println(obj1.name);
        
        System.out.println("-----Object2 vars-----");
        System.out.println(obj2.count);
        System.out.println(obj2.name);
    }

}
