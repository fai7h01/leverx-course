package com.leverx.course.collections;

import java.util.*;
import java.util.function.Function;

public class CollectionsMethods {

    public static void main(String[] args) {

        List<String> data = FakeData.generateFakeData(100);
        data.sort(Comparator.comparing(Function.identity()));
        System.out.printf("Sorted: %s%n", data);

        Collections.reverse(data);
        System.out.printf("Reversed: %s%n", data);

//        Collections.shuffle(data);
//        System.out.printf("Shuffled: %s%n", data);

        List<String> subList = new ArrayList<>(data.subList(0, 4));
        System.out.println(subList);

        System.out.println(Collections.disjoint(new ArrayList<>(List.of("Rona", "Aldo", "Cayla", "Sally")),
                new ArrayList<>(List.of("Rona", "Aldo", "Cayla", "Sally"))));

        System.out.println(Collections.disjoint(new ArrayList<>(List.of("Luka", "Benny")),
                new ArrayList<>(List.of("Rona", "Aldo", "Cayla", "Sally"))));

        List<List<String>> lists = Collections.nCopies(2, data);
        System.out.println(lists);

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.rotate(nums, 3); //moves last 3 to front, if negative moves front to end
        System.out.println(nums);
    }

}
