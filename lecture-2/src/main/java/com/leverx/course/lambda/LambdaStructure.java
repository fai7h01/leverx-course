package com.leverx.course.lambda;

public class LambdaStructure {

    public static void repeatingMessage(String text, int count) {

        Runnable r = () -> {
            for (int i = 0; i < count; i++) {
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }

    public static void main(String[] args) {

        repeatingMessage("Hello", 10);

        for (int i = 0; i < 3; i++) {
            //new Thread(() -> System.out.println(i)).start(); Compile Error, because i is not final or effectively final, it changes value every iteration
            final int j = i;
            new Thread(() -> System.out.println(j)).start();
        }


        int[] array = new int[1];
        for (int i = 0; i < 3; i++) {
            array[0] = i;
            new Thread(() -> System.out.println(array[0])).start();
        }

        for (String arg : args) {
            new Thread(() -> System.out.println(arg)).start();
        }
    }

}
