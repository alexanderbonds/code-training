package ru.happyshark.training.random.sum_numbers_in_string;

//public class Solution {
//    // Написать метод, который получает на вход строку(напрмер "42324137") и суммирует все числа, которые есть в этой строке, возвращет сумму
//    public static Integer calculateSum(String input) {
//        return null;
//    }
//}

/*
 *  Решение:
 */

public class Solution {
    // Написать метод, который получает на вход строку(напрмер "42324137") и суммирует все числа, которые есть в этой строке, возвращет сумму
    public static Integer calculateSum(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            result += Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateSum("12345"));
    }
}

// хочу метод, получающий отдельно каждую строку в числе