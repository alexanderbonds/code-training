package ru.happyshark.training.codewars.kyu8.what_is_between;

import java.util.stream.IntStream;

public class Kata {

//    https://www.codewars.com/kata/55ecd718f46fba02e5000029
//
//    Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.
//
//    For example:
//
//    a = 1
//    b = 4
//    --> [1, 2, 3, 4]

    public static int[] between(int a, int b) {
        int[] array = new int[b - a + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = a++;
        }
        return array;
    }

    public static int[] anotherSolution(int a, int b) {
        return IntStream.rangeClosed(a, b).toArray();
    }
}
