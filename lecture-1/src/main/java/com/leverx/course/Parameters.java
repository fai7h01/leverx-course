package com.leverx.course;

import java.util.ArrayList;
import java.util.List;

public class Parameters {

    private void doSmthWithParam(List<String> friends) {
        friends.add("String");
    }

    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Old String");

        Parameters parameters = new Parameters();
        System.out.println(people.size());
        parameters.doSmthWithParam(people);
        System.out.println(people.size());

    }
}
