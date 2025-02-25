package com.leverx.course.generics;

import java.util.Arrays;

public class ElementsSwapper {

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        String[] array = {"A", "B", "C", "D"};

        swap(array, 0, 3);

        System.out.println(Arrays.toString(array));


    }

}
