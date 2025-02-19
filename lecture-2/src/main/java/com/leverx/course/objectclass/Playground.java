package com.leverx.course.objectclass;

public class Playground {

    public static void main(String[] args) {

        User user = new User("Mike", 24);
        User clone = user.clone();

        System.out.println("Original User: " + user.name + " " + user.age);
        System.out.println("Clone User: " + clone.name + " " + clone.age);

        System.out.println(user.equals(clone));

        System.out.println(user.getClass().getName());

        System.out.println(user.hashCode());
        System.out.println(clone.hashCode());

        System.out.printf("Memory address representation: %d%n", System.identityHashCode(user));
        System.out.printf("Memory address representation: %d%n", System.identityHashCode(clone));
    }

}
