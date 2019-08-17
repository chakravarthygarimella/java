package com.java.oops.constructor;

/**
 * 
 * Calling a constructor from the another constructor of same class is known as Constructor chaining.
 * The real purpose of Constructor Chaining is that you can pass parameters through a bunch of different constructors, 
 * but only have the initialization done in a single place. 
 * This allows you to maintain your initializations from a single location, while providing multiple constructors to the user. 
 * If we don’t chain, and two different constructors require a specific parameter, 
 * you will have to initialize that parameter twice, and when the initialization changes,
 * you’ll have to change it in every constructor, instead of just the one
 * 
 * @author Chakravarthy Garimella
 * May 21, 2019
 *
 */
public class Employee {
    
    public String empName;
    public int empSalary;
    public String address;

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.disp();
    }
    
    public Employee() {
        this("chakri");
    }

    public Employee(String name) {
        this(name, 2345);
    }

    public Employee(String name, int salary) {
        this(name, salary, "1800 arch");
        
    }

    public Employee(String name, int salary, String address) {
        this.empName = name;
        this.empSalary = salary;
        this.address = address;
    }
    
    void disp() {
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+empSalary);
        System.out.println("Employee Address: "+address);
    }
}
