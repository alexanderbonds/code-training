package ru.abondarenko.training.leetcode.easy.ex_1961;

//  https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/
//
//  Given a string s and an array of strings words, determine whether s is a prefix string of words.
//
//  A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.
//
//  Return true if s is a prefix string of words, or false otherwise.
//
//  Example 1:
//  Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
//  Output: true
//  Explanation:
//  s can be made by concatenating "i", "love", and "leetcode" together.
//
//  Example 2:
//  Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
//  Output: false
//  Explanation:
//  It is impossible to make s using a prefix of arr.

public class MainApp {
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word);
            if (stringBuilder.length() == s.length()) {
                break;
            }
            if (!s.startsWith(stringBuilder.toString())) {
                return false;
            }
        }
        return s.equals(stringBuilder.toString());
    }
}
