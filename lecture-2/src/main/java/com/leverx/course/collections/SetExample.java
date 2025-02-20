package com.leverx.course.collections;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(15, 1, 32, 42));

        SortedSet<Integer> integers = sortedSet.headSet(35); //returns VIEW of less than param (same reference)
        System.out.println(integers);

        SortedSet<Integer> integers1 = sortedSet.tailSet(35); // returns view of greater than param
        System.out.println(integers1);

        System.out.println(sortedSet.first()); //returns first
        System.out.println(sortedSet.last()); //returns last

        System.out.println(sortedSet.subSet(15, 100));

        NavigableSet<Integer> navigableSet = new TreeSet<>(Arrays.asList(98, 72, 18, 107, 23));
        System.out.println(navigableSet.ceiling(18)); // returns smallest e that greater or equal to specified param
        System.out.println(navigableSet.floor(20)); // returns largest e that less or equal to specified param
        System.out.println(navigableSet.higher(20)); // returns smallest e that is higher than param
        System.out.println(navigableSet.lower(20)); // returns largest e that is less than param
        System.out.println(navigableSet.pollFirst()); // returns and removes smallest
        System.out.println(navigableSet.pollLast()); // returns and removes largest
        System.out.println(navigableSet);


    }


}
