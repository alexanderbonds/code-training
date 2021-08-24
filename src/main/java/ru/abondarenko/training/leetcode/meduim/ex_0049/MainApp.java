package ru.abondarenko.training.leetcode.meduim.ex_0049;

//  https://leetcode.com/problems/group-anagrams/
//
//  Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//  An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//  Example 1:
//  Input: strs = ["eat","tea","tan","ate","nat","bat"]
//  Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
//  Example 2:
//  Input: strs = [""]
//  Output: [[""]]
//
//  Example 3:
//  Input: strs = ["a"]
//  Output: [["a"]]

import java.util.*;

public class MainApp {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String[], List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            boolean flag = false;
            String[] arrWord = Arrays.stream(strs[i].split("")).sorted(Comparator.naturalOrder()).toArray(String[]::new);
            for (String[] arr: hashMap.keySet()) {
                if (Arrays.equals(arr, arrWord)) {
                    hashMap.get(arr).add(strs[i]);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                hashMap.put(arrWord, new ArrayList<>());
                hashMap.get(arrWord).add(strs[i]);
            }
        }
        List<List<String>> resultSuperList = new ArrayList<>();
        for (String[] arr : hashMap.keySet()) {
            resultSuperList.add(hashMap.get(arr));
        }
        return resultSuperList;
    }
    public static List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
