package com.java.oops.encapsulation;

import com.java.oops.models.EmployeeCount;

/**
 * 
 * @author Chakravarthy Garimella
 * May 20, 2019
 *
 */
public class EncapsulationExample {

    /**
     * Making instance variables private so that they can not access directly from outside of the class
     * You can set/get the values through the getter and setter methods only
     * @param args
     */
	public static void main(String[] args) {
		EmployeeCount count = new EmployeeCount();
		count.setNumberOfEmployees(1000);
		System.out.println("The employee count is " +count.getNumberOfEmployees());
	}
}
