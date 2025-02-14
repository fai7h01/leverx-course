package com.leverx.course.interfaces;

import java.util.Comparator;

public class PersonHeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return Double.compare(p1.getHeight(), p2.getHeight());
    }
}
