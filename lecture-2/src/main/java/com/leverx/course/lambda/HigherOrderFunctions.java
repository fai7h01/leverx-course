package com.leverx.course.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class HigherOrderFunctions {

    public static Function<Integer, Integer> multiplier(int x) {
        return y -> x * y;
    }

    public static void runLambda(Function<Integer, Integer> lambda, int i) {
        System.out.println(lambda.apply(i));
    }

    public static Comparator<String> reverse(Comparator<String> comparator) {
        return (x, y) -> comparator.compare(y, x);
    }

    public static void main(String[] args) {

        Function<Integer, Integer> multiplyByTwo = o -> 2 * o;
        Function<Integer, Integer> multiplyByThree = o -> 3 * o;

        runLambda(multiplyByTwo, 5);
        runLambda(multiplyByThree, 5);

        List<String> words = Arrays.asList("apple", "orange", "banana", "grape");

        words.sort(reverse(String::compareTo));
        //words.sort(Comparator.reverseOrder());
        //words.sort((x, y) -> y.compareTo(x));

        System.out.println(words);
    }

}
