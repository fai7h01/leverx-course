package com.leverx.course.interfaces;

import java.util.*;

public class ComparableExample {

    public static void main(String[] args) {

        Person person1 = new Person("Yin", 28);
        Person person2 = new Person("Alice", 24);
        Person person3 = new Person("Martis", 23);

        List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));

        System.out.println("Person List Before Sorting: " + persons);
        Collections.sort(persons);
        System.out.println("Person List After Sorting: " + persons);

        Person person4 = new Person("Luka", 24, 90.5, 184.5);
        Person person5 = new Person("Sesili", 20, 52.5, 175.4);
        Person person6 = new Person("Tatuli", 21, 51.8, 168.9);
        Person person7 = new Person("Benny", 18, 65.7, 170.5);

        PersonHeightComparator personHeightComparator = new PersonHeightComparator();
        PersonWeightComparator personWeightComparator = new PersonWeightComparator();

        List<Person> persons2 = new ArrayList<>(Arrays.asList(person4, person5, person6, person7));

        System.out.println("Person2 List Before Sorting: " + persons2);
        //Collections.sort(persons2, personHeightComparator);
        //persons2.sort(personHeightComparator);
        persons2.sort(Comparator.comparing(Person::getHeight));
        System.out.println("Person2 List After Sorting By Height: " + persons2);
        //Collections.sort(persons2, personWeightComparator);
        //persons2.sort(personWeightComparator);
        persons2.sort(Comparator.comparing(Person::getWeight));
        System.out.println("Person2 List After Sorting By Weight: " + persons2);

        //using lambda
        //persons2.sort(Comparator.comparing(Person::getWeight));
        //persons2.sort(Comparator.comparing(Person::getHeight));

    }

}

//https://www.freecodecamp.org/news/comparable-vs-comparator-explained-in-java/

