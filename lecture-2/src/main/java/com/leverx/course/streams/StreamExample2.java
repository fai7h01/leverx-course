package com.leverx.course.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

    public static void main(String[] args) {

        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        List<String> words = Arrays.asList("apple", "apple", "orange", "banana");

        Stream<String> skip = words.stream().skip(1);
        skip.forEach(System.out::println);

        words.stream().distinct().forEach(System.out::println);

        words.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        List<Double> list = Stream.iterate(1.0, d -> d * 2).peek(System.out::println).limit(10).toList();
        //System.out.println(list);
    }

}
