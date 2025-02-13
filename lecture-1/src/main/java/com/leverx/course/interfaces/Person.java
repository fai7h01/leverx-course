package com.leverx.course.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//comparable interface defines a NATURAL ORDER for objects
public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age, person.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {

        var personList = new ArrayList<Person>();

        personList.addAll(List.of(
                new Person("Ben", 28),
                new Person("Melissa", 19),
                new Person("Mike", 23)
        ));

        personList.forEach(System.out::println);
        Collections.sort(personList);
        personList.forEach(System.out::println);

    }
}
