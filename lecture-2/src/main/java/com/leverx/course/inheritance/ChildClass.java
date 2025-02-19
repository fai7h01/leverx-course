package com.leverx.course.inheritance;


interface interfaceForImplementation {

    default String getName() {
        return "interfaceForImplementation";
    }
}

abstract class abstractClass {

    public String getName() {
        return "abstractClass";
    }
}

public class ChildClass extends abstractClass implements interfaceForImplementation {

    public static void main(String[] args) {
        System.out.println(new ChildClass().getName());
    }
}
