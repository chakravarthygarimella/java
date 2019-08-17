package com.java.oops.polymorphism;

public class Dog extends Animal{

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.animalSound();

	}

	@Override
	public void animalSound() {
		System.out.println("Bow Bow.. ... ..");
	}

}
