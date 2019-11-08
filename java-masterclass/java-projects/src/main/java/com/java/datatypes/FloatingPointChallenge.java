package com.java.datatypes;

public class FloatingPointChallenge {

	public static void main(String[] args) {
		int pounds = 2;
		double result = convertPoundsToKg(pounds);
		System.out.println("pounds converted in kg- result: "+result);
	}
	
	public static double convertPoundsToKg(double poundsInput) {
		return poundsInput *0.45359237;
	}

}
