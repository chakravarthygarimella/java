package com.java.oops.aggregation;

@SuppressWarnings("unused")
public class Address {
    
    private String name;
    private String streetName;
    private String apartmentNo;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    
    public Address(String name, String streetName, String apartmentNo, String city, String state, String zipCode,
                    String country) {
        this.name = name;
        this.streetName = streetName;
        this.apartmentNo = apartmentNo;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [name=" + name + ", streetName=" + streetName + ", apartmentNo=" + apartmentNo + ", city="
                        + city + ", state=" + state + ", zipCode=" + zipCode + ", country=" + country + "]";
    }
    
}
