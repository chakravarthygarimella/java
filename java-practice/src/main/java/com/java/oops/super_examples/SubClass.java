package com.java.oops.super_examples;

/**
 * By using the super keyword, we can call variable of parent class with having same name withrespect to child class
 * Sub class and parent class have same variable name var
 * @author Chakravarthy Garimella (cgarim823)
 * Jun 6, 2019
 *
 */
public class SubClass extends SuperClass{
    
    int var =200;
    
    public void getVar() {
        System.out.println(var);
        System.out.println(super.var);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.getVar();
    }

}
