package com.java.corejava.generics.multiple;

import java.util.ArrayList;

public class TypeSafety {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("c");
        list.add("s");
        list.add(10);
        String str1 = (String) list.get(0);
        String str2 = (String) list.get(1);
        String str3 = (String) list.get(2);

        /**
         * Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
         * at com.java.corejava.generics.multiple.TypeSafety.main(TypeSafety.java:13)
         */
        System.out.println(str3);

        ArrayList<String> typeList = new ArrayList<>();
        typeList.add("a");

        /**
         * The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
         * Compilation error
         */
        // typeList.add(12);

    }
}
