package ru.happyshark.training.codewars.kyu8.count_of_positives_sum_of_negatives;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Kata {

//    https://www.codewars.com/kata/576bb71bbbcf0951d5000044/
//
//    Given an array of integers.
//
//    Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
//
//    If the input array is empty or null, return an empty array.
//
//            Example
//    For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0) {
            return new int[] {};
        }
        int countPositives = (int) Arrays.stream(input).filter(i -> i > 0).count();
        int sumNegatives = Arrays.stream(input).filter(i -> i < 0).sum();
        return new int[] {countPositives, sumNegatives};
    }
}
