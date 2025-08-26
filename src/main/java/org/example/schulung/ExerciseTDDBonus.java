package org.example.schulung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExerciseTDDBonus {

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Es muss eine nicht-negative Zahl sein.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        List<Integer> list1 = new ArrayList<>(IntStream.of(a).boxed().toList());
        List<Integer> list2 = new ArrayList<>(IntStream.of(b).boxed().toList());
        list1.addAll(list2);
        return list1.stream().mapToInt(Integer::intValue).toArray();
    }
}
