package com.hama.array.towSum;

import java.util.Arrays;

/**
 * Given an array of integers,
 * return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * Created by rns on 2017/3/27.
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int temp =target - nums[i]; // compare num
            for (int j = 0; j < nums.length; j++) {
                // exclude the num itself
                if(i == j){
                    continue;
                }
                if(temp == nums[j]){
                    // return the index
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,5};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
