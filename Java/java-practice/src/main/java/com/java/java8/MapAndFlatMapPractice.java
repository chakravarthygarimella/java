package com.java.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMapPractice {

    public static void main(String[] args) {
        Stream<String> mapList = Stream.of("a", "b", "c");
        Stream<Stream<String>> flatMapList = Stream.of(mapList, mapList);

        List<String> listFromMap = mapList.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(listFromMap);

    }

}
