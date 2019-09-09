package com.java.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExample4 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("h", "a", "e");
        Collections.sort(list);
        list.forEach((l) -> {
            System.out.println(l);
        });
    }

}
