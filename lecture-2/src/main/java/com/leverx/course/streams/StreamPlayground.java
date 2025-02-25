package com.leverx.course.streams;

import com.github.javafaker.Faker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPlayground {

    public static void main(String[] args) {

        RegularProcess.processData();
        ParallelProcess.parallelProcessData();



    }

}

class ParallelProcess {

    static String filePath2 = "C:\\Users\\user\\Desktop\\leverx-course\\grouped_list2.txt";

    static Set<Person> personsSet = DataGenerator.persons;


    static void parallelProcessData() {
        long currentTime = System.currentTimeMillis();
        long duration;

        ConcurrentMap<String, Integer> favColorsParallel = personsSet.parallelStream()
                .filter(person -> person.getAge() > 26)
                .collect(Collectors.groupingByConcurrent(
                        Person::getFavColor,
                        Collectors.summingInt(o -> 1)));


        try {
            Files.write(Paths.get(filePath2),
                    favColorsParallel.entrySet()
                            .stream()
                            .map(entry -> entry.getKey() + " : " + entry.getValue())
                            .collect(Collectors.toList()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        duration = System.currentTimeMillis() - currentTime;
        System.out.printf("Colors Parallel Stream duration: %d%n", duration);
    }



}


class RegularProcess {

    static String filePath1 = "C:\\Users\\user\\Desktop\\leverx-course\\grouped_list1.txt";

    static Set<Person> personsSet = DataGenerator.persons;


    static void processData() {
        long currentTime = System.currentTimeMillis();
        long duration;
        Map<String, Long> favColors = personsSet.stream()
                .filter(person -> person.getAge() > 26)
                .collect(Collectors.groupingBy(
                        Person::getFavColor,
                        Collectors.counting()));


        try {
            Files.write(Paths.get(filePath1),
                    favColors.entrySet()
                            .stream()
                            .map(entry -> entry.getKey() + " : " + entry.getValue())
                            .collect(Collectors.toList()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        duration = System.currentTimeMillis() - currentTime;
        System.out.printf("Colors Stream duration: %d%n", duration);
    }


}


class DataGenerator {

    static Faker faker = new Faker();

    static Set<Person> persons = Stream.iterate(0, i -> i + 1)
            .limit(10000000)
            .map(o -> {
                return new Person(faker.number().numberBetween(0, 10000000),
                        faker.number().numberBetween(0, 55),
                        faker.name().firstName(),
                        faker.color().name());
            })
            .collect(Collectors.toSet());

}



class Person {
    int id;
    int age;
    String name;
    String favColor;


    Person(int id, int age, String name, String facColor) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.favColor = facColor;
    }

    String getFavColor() {
        return this.favColor;
    }

    int getId() {
        return this.id;
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}