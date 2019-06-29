package com.java.corejava.string;

public class CompareToMethodExample {

    public static void main(String[] args) {
        String str1 = "chakri";
        String str2 = "naveen";
        String str3 = "CHAKRI";
        String str4 = "chakri";
        String str5 = "";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));

        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));

        System.out.println(str1.compareToIgnoreCase(str3));

        System.out.println(str5.compareTo(str1));

    }

}
