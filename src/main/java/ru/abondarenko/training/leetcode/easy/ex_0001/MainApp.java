package ru.abondarenko.training.leetcode.easy.ex_0001;

//  https://leetcode.com/problems/two-sum/
//
//  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//  You may assume that each input would have exactly one solution, and you may not use the same element twice.
//  You can return the answer in any order.
//
//  Example 1:
//  Input: nums = [2,7,11,15], target = 9
//  Output: [0,1]
//  Output: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//  Example 2:
//  Input: nums = [3,2,4], target = 6
//  Output: [1,2]
//
//  Example 3:
//  Input: nums = [3,3], target = 6
//  Output: [0,1]

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    /**
     * O(n2) time complexity
     * @param nums - array of integers
     * @param target - integer number
     * @return int[]
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution for  defined input data!");
    }

    /**
     * O(1) time complexity
     * @param nums - array of integers
     * @param target - integer number
     * @return int[]
     */
    public static int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            if (map.containsKey(requiredNumber) && map.get(requiredNumber) != i) {
                return new int[] {i, map.get(requiredNumber)};
            }
        }

        throw new IllegalArgumentException("No solution for  defined input data!");
    }

    /**
     * It's at least two times faster than other.
     * @param nums - array of integers
     * @param target - integer number
     * @return int[]
     */
    public static int[] twoSumMaxFaster(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] response = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                response[0] = map.get(target - nums[i]);
                response[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return response;
    }
}
