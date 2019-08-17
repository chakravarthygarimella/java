package com.java.oops.polymorphism;

public class Car extends Vehicle{

    /**
     * Runtimeolymorphism: jvm will decide which method to be called at run time
     * @param args
     */
    public static void main(String[] args) {
        
        //child class method will be called
        Car car = new Car();
        car.wheels();
        
        //parent class method will be called
        Vehicle vehicle = new Vehicle();
        vehicle.wheels();
        
        //child method will be called
        Vehicle vehicle2 = new Car();
        vehicle2.wheels();
    }
    
    public void wheels() {
        System.out.println("four wheels");
    }

}
