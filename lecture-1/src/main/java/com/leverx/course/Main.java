package com.leverx.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello world!");

        Properties properties = System.getProperties();
        System.out.println(properties);

        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        Stream<?> stream = Stream.empty();
        stream = list.stream();
        list.forEach(System.out::println);

    }
}