package com.java.oops;

/**
 * 
 * @author Chakravarthy Garimella
 * May 20, 2019
 *
 */
public class ConstructorExample {
	
	private String var1;
	private String var2;
	
	/**
	 * Default constructor or zero argument constructor
	 */
	public ConstructorExample() {
		this.var1 = "variable-1";
		this.var2 = "variable-2";
	}
	
	/**
	 * Parameterized constructor
	 * @param var1
	 * @param var2
	 */
	public ConstructorExample(String var1, String var2) {
		this.var1 = var1;
		this.var2 = var2;
	}

	public static void main(String[] args) {
		ConstructorExample obj1 = new ConstructorExample();
		ConstructorExample obj2 = new ConstructorExample("variable-1", "variable-2");
		System.out.println(obj1);
		System.out.println(obj2);
	}

	@Override
	public String toString() {
		return "ConstructorExample [var1=" + var1 + ", var2=" + var2 + "]";
	}

}
