package com.hama.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: rns
 * @Date: 2019/1/31 下午8:52
 * @Description: _169_Majority_Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,2,3]
 * Output: 3
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class _169_Majority_Element {

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        Map<Integer, Integer> count = new HashMap<>();
        int times = nums.length / 2;
        for (int num : nums) {
            int value = count.containsKey(num) ? count.get(num) : 0;
            if (times == value) {
                return num;
            }
            count.put(num, value + 1);
        }
        return 0;
    }

    /**
     * always exist
     * @param nums
     * @return
     */
    public static int majorityElement2(int[] nums) {
        int m=0, count=0;
        for (int i = 0; i < nums.length; i++) {
            if(0 == count){
                count++;
                m = nums[i];
            } else if(m == nums[i]){
                count++;
            } else {
                count--;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2, 1, 2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement2(nums));
    }
}