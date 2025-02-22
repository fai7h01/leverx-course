package com.leverx.course.streams;

import java.math.BigInteger;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        Stream<String> words = Stream.of("apple", "orange", "peach");

        Stream<String> empty = Stream.empty();

        Stream<Double> randoms = Stream.generate(Math::random); // infinite

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)); // infinite

        //randoms.forEach(System.out::println);
        //integers.forEach(System.out::println);
    }

}
