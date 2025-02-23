package com.leverx.course.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample3 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "orange", "banana");

        Optional<String> largest = words.stream().max(String::compareToIgnoreCase);

        //System.out.println(largest.get());

        Optional<String> startsWithA = words.stream().filter(word -> word.startsWith("a")).findFirst();

        startsWithA = words.stream().parallel().filter(word -> word.startsWith("a")).findAny();

        boolean anyMatch = words.parallelStream().anyMatch(word -> word.startsWith("b"));
        //System.out.println(anyMatch);

        Stream.of("a", "b", "c", "d").forEach(System.out::println);

        Set<String> set = Stream.of("a", "a", "a", "v").collect(Collectors.toSet());
        //System.out.println(set);

        Set<String> treeSet = Stream.of("b", "m", "a", "c").collect(Collectors.toCollection(TreeSet::new));
        //System.out.println(treeSet);

        String joined = Stream.of("a", "b", "c", "d").collect(Collectors.joining(", "));
        System.out.println(joined);


    }

}
