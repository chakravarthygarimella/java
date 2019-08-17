package com.java.oops.staticimports;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class StaticImportsExample {

    public static void main(String[] args) {
        double var1 = sqrt(13);
        double var2 = tan(50);
        System.out.println(var1);
        System.out.println(var2);
    }

}
