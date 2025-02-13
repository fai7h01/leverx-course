package com.leverx.course;

public class PassByValue {

    public static void main(String[] args) {

        int num = 15;
        System.out.println("Primitive Before Modifying: " + num);
        modifyPrimitive(num);
        System.out.println("Primitive After Modifying: " + num);

        Person person = new Person("Luka");
        System.out.println("Object Before Modifying: " + person.getName());
        modifyObject(person);
        System.out.println("Object After Modifying: " + person.getName());
    }

    static void modifyObject(Person person) {
        person.setName("Modified Name");
        System.out.println("Object inside modify method: " + person.getName());

        person = new Person("Mike");
        System.out.println("After assignment: " + person.getName());
    }

    static void modifyPrimitive(int num) {
        num = 20;
        System.out.println("Primitive inside modify method: " + num);
    }

}

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

}