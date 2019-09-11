package com.java.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class UtilClass {
    
    public static List<String> LIST =
                    Arrays.asList("Alex", "Bob", "Chase", "Dom", "Halsey", "Drake", "Jason", "eminem");


    public static final Map<String, Integer> MAP =
                    ImmutableMap.of("Alex", 111, "Bob", 212, "Dom", 543, "Drake", 777, "Jason", 765);

}
