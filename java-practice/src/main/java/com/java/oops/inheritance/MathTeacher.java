package com.java.oops.inheritance;

/**
 * 
 * @author Chakravarthy Garimella
 * May 20, 2019
 *
 */
public class MathTeacher extends Teacher{
    private String mainSubject = "Maths";

    /**
     * Here we are reusing methods and properties of parent class Teacher for child class MathTeacher
     * Relation: MathTeacher is a Teacher
     * @param args
     */
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        
        System.out.println("------Inherited instance variables from parent class Teacher------");
        System.out.println("College : "+mathTeacher.college);
        System.out.println("Designation : "+mathTeacher.designation+ "\r\n");
        
        System.out.println("------Inherited method from parent class Teacher------------------");
        mathTeacher.work();
        System.out.println("\r\n");
        
        System.out.println("------child class vaiable from MathTeacher------------------------");
        System.out.println("main subject of math teacher: "+mathTeacher.mainSubject);
    }

}
