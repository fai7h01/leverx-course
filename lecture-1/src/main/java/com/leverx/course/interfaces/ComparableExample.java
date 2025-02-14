package com.leverx.course.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {

        Person person1 = new Person("Yin", 28);
        Person person2 = new Person("Alice", 24);
        Person person3 = new Person("Martis", 23);

        List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));

        System.out.println("Person List Before Sorting: " + persons);
        Collections.sort(persons);
        System.out.println("Person List After Sorting: " + persons);


    }

}

