package com.leverx.course.multithreading;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

//        MultiThreadClass multiThreadClass1 = new MultiThreadClass();
//        MultiThreadClass multiThreadClass2 = new MultiThreadClass();
//
//        multiThreadClass1.start();
//        multiThreadClass2.start();

        for (int i = 0; i < 5; i++) {
            MultiThreadClass multiThreadClass = new MultiThreadClass(i);
            Thread thread = new Thread(multiThreadClass);
            thread.start();
            //thread.join();
            //System.out.println(thread.isAlive());
        }


    }

}
