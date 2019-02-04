package com.hama.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: rns
 * @Date: 2019/2/4 下午11:56
 * @Description: _217_Contains_Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class _217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }

        return set.size() != nums.length;
    }
}
