package com.java.oops.polymorphism;

public class Cat extends Animal{

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.animalSound();
	}

	@Override
	public void animalSound() {
		System.out.println("Maw..Maw.. .. ...");
	}

}
