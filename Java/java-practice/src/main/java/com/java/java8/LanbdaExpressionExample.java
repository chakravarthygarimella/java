package com.java.java8;

import com.java.corejava.interfaces.Drawable;

public class LanbdaExpressionExample {

    public static void main(String[] args) {
        int width = 10;

        // without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {

            @Override
            public void draw() {
                System.out.println("width: " + width);

            }
        };
        d.draw();

    }

}
