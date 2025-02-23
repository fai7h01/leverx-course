package com.leverx.course.streams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample3 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "orange", "banana");

        Optional<String> largest = words.stream().max(String::compareToIgnoreCase);

        //System.out.println(largest.get());

        Optional<String> startsWithA = words.stream().filter(word -> word.startsWith("a")).findFirst();

        startsWithA = words.stream().parallel().filter(word -> word.startsWith("a")).findAny();

        boolean anyMatch = words.parallelStream().anyMatch(word -> word.startsWith("b"));
        System.out.println(anyMatch);

    }

}
