package ru.abondarenko.training.leetcode.easy.ex_0014;

//  https://leetcode.com/problems/longest-common-prefix/
//
//  Write a function to find the longest common prefix string amongst an array of strings.
//  If there is no common prefix, return an empty string "".
//
//  Example 1:
//  Input: strs = ["flower","flow","flight"]
//  Output: "fl"
//
//  Example 2:
//  Input: strs = ["dog","racecar","car"]
//  Output: ""
//  Explanation: There is no common prefix among the input strings.

public class MainApp {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return null;
        }

        String previous = strs[0];
        int skip = 0;
        for (int i = 1; i < strs.length; i++){
            if (strs[i].length() <= previous.length()){
                previous = strs[i];
                skip = i;
            }
        }

        for (int i = 0; i < previous.length(); i++){
            for (int j = 0; j < strs.length; j++){
                if (j == skip){
                    continue;
                }
                if (previous.charAt(i) != strs[j].charAt(i)){
                    return previous.substring(0, i);
                }
            }
        }
        return previous;
    }
}
