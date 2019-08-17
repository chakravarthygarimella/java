package com.java.oops.models;

/**
 * 
 * @author Chakravarthy Garimella
 * May 20, 2019
 *
 */
public class EmployeeCount {
	
    //Making instance variable as private(encapsulation) 
	private int numberOfEmployees = 0;

	/**
	 * @return the numberOfEmployees
	 */
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	/**
	 * @param numberOfEmployees the numberOfEmployees to set
	 */
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

}
