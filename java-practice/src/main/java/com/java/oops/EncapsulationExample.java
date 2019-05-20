package com.java.oops;

import com.java.oops.models.EmployeeCount;

public class EncapsulationExample {

	public static void main(String[] args) {
		EmployeeCount count = new EmployeeCount();
		count.setNumberOfEmployees(1000);
		System.out.println("The employee count is " +count.getNumberOfEmployees());
	}
}
