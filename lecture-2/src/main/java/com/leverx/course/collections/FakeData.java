package com.leverx.course.collections;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FakeData {

    private static final Faker FAKER = new Faker();

    public static List<String> generateFakeData(int size) {
        return IntStream.range(0, size)
                .mapToObj(i -> FAKER.name().firstName())
                .collect(Collectors.toList());
    }

}
