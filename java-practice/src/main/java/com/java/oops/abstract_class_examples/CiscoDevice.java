package com.java.oops.abstract_class_examples;

public class CiscoDevice extends NetworkDevice{

    public static void main(String[] args) {
        CiscoDevice device = new CiscoDevice();
        device.configDevice();
    }

    @Override
    public void configDevice() {
        System.out.println("configuring device... .. .");
    }

}
