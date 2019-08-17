package com.java.oops.polymorphism;

public class Cat extends Animal{
    
    /**
     * Cat is a Animal---->IS-A Relationship
     * Cat Has-A color---->Has-A Relationship
     */
    private String color;

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.animalSound();
	}

	@Override
	public void animalSound() {
		System.out.println("Maw..Maw.. .. ...");
	}

}
