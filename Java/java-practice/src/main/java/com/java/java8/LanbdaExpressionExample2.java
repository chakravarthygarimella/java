package com.java.java8;

import com.java.corejava.interfaces.Drawable2;

public class LanbdaExpressionExample2 {

    public static void main(String[] args) {

        int width = 10;

        Drawable2 d = () -> {
            System.out.println("width: " + width);
        };
        d.draw();

    }

}
