package com.java.java8.lambda;

public class LambdaExpresion3 {

    public static void main(String[] args) {

        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("running run method");

            }
        };
        Thread t = new Thread(r);
        t.start();

        Runnable r2 = () -> {
            System.out.println("running rum method from lambda");
        };
        Thread t2 = new Thread(r2);
        t2.start();

        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("running run method from anonymous class");
            }
        });
        t3.start();


    }

}
