package ru.happyshark.training.codewars.kyu8.find_numbers_which_are_divisible_by_given_number;

import java.util.Arrays;

public class EvenNumbers {

//    https://www.codewars.com/kata/55edaba99da3a9c84000003b
//
//    Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
//    First argument is an array of numbers and the second is the divisor.
//
//            Example
//    divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]

    public static int[] divisibleBy(int[] numbers, int divider) {
        int[] result = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                result[count] = numbers[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public static int[] anotherSolution(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(i -> i % divider == 0)
                .toArray();
    }
}
