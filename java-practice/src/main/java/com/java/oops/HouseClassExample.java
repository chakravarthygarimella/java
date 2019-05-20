package com.java.oops;

/**
 * 
 * @author Chakri
 *
 */
public class HouseClassExample {
	
	//State of the class
	private String address;
	private String color;
	
	public HouseClassExample() {
	}
	
	public HouseClassExample(String addrs, String clr) {
		this.address = addrs;
		this.color = clr;
	}
	
	public static void main(String args[]) {
		HouseClassExample house = new HouseClassExample();
		house.openDoor();
		house.closeDoor();
		house.getAddress();
		
	}
	
	//Behavior of the class called House
	public void openDoor() {
		System.out.println("please open the door");
	}
	
	public void closeDoor() {
		System.out.println("please close the door");
	}
	
	public void getAddress() {
		System.out.println("Address of the house: " + new HouseClassExample("1835 arch st", "white"));
	}

	@Override
	public String toString() {
		return "House [address=" + address + ", color=" + color + "]";
	}
	
}
