package com.java.corejava.string;

import org.junit.Test;

public class CharAt {

    public static void main(String[] args) {
        String str = "welcome to comcast";

        char c0 = str.charAt(1);
        char c1 = str.charAt(1);
        char c2 = str.charAt(2);
        char c3 = str.charAt(3);

        System.out.println("char at index 0: " + c0);
        System.out.println("char at index 1: " + c1);
        System.out.println("char at index 2: " + c2);
        System.out.println("char at index 3: " + c3);
    }

    @Test
    public void printAllCharsInString() {
        String str = "usa has 50 states over all";
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.println("char at index " + i + ": " + str.charAt(i));
        }
    }

    @Test
    public void addNumbersInString() {
        String str = "hello0123456789";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("Total addition of numbers in string: " + sum);
    }

    @Test
    public void countCharInString() {
        String str = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println("Total count: " + count);
    }
}
