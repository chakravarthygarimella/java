package com.java.java8.methodreference;

public class MethodRef2 {

    public static void main(String[] args) {
        Thread t = new Thread(MethodRef2::threadStatus);
        t.start();
    }

    public static void threadStatus() {
        System.out.println("Thread is runnning");
    }

}
