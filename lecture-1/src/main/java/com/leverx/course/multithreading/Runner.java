package com.leverx.course.multithreading;

public class Runner {

    public static void main(String[] args) {

        MultiThreadClass multiThreadClass1 = new MultiThreadClass();
        MultiThreadClass multiThreadClass2 = new MultiThreadClass();

        multiThreadClass1.start();
        multiThreadClass2.start();

    }

}
