package com.leverx.course.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunnableExample {

    public static void main(String[] args) {

        Runnable hellos = () -> {
            for (int i = 0; i <= 10; i++) System.out.println("Hello " + i);
        };

        Runnable goodbyes = () -> {
            for (int i = 0; i <= 10; i++) System.out.println("Goodbye " + i);
        };

        Executor executor = Executors.newCachedThreadPool();
        //Executor executor = Executors.newFixedThreadPool(2);
        executor.execute(hellos);
        executor.execute(goodbyes);
    }

}
