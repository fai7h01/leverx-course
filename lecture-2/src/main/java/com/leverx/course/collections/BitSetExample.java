package com.leverx.course.collections;

import java.util.BitSet;

public class BitSetExample {

    public static void main(String[] args) {

        //track task statuses
        BitSet taskStatuses = new BitSet();

        //assume we have 5 tasks and their statuses are represented as follows:
        //task 0: Completed, Task 1: In-progress, Task 2: Failed, Task 3: Completed, Task 4: In-progress
        taskStatuses.set(0); // Task 0 -> Completed
        taskStatuses.set(3); // Task 3 -> Completed
        taskStatuses.set(1); // Task 1 -> In-progress
        taskStatuses.set(4); // Task 4 -> In-progress

        System.out.println("Task statuses: " + taskStatuses); // {0, 1, 3, 4}

        //Check if task 0 is completed
        if (taskStatuses.get(0)) {
            System.out.println("Task 0 is completed.");
        }

        taskStatuses.set(2); // Task 2 -> failed
        System.out.println("Task statuses after marking task 2 as failed: " + taskStatuses);

    }

}
