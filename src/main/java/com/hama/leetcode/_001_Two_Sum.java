package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午7:16
 * @Description: _001_Two_Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class _001_Two_Sum {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int temp =target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(i == j){
                    continue;
                }
                if(temp == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
