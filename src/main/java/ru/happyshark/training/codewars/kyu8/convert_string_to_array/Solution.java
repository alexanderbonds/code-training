package ru.happyshark.training.codewars.kyu8.convert_string_to_array;

public class Solution {

//    https://www.codewars.com/kata/57e76bc428d6fbc2d500036d
//
//    Write a function to split a string and convert it into an array of words. For example:
//
//    "Robin Singh" ==> ["Robin", "Singh"]
//    "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
