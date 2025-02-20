package com.leverx.course.collections;

import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {

        List<String> collection = new ArrayList<>(Arrays.asList("Luka", "Benny"));
//        System.out.println("Before filling: " + collection);
//        Collections.fill(collection, "Unknown");
//        System.out.println("After filling: " + collection);
//        collection.clear();
//        System.out.println(collection);

        //iteration with iterator
//        ListIterator<String> stringListIterator = collection.listIterator();
//        while (stringListIterator.hasNext()) {
//            System.out.println(stringListIterator.next());
//        }
//
//        Iterator<String> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext();) {
            if (iterator.next().equals("Luka")) {
                iterator.remove();
            }
        }
        System.out.println(collection);
    }
}
