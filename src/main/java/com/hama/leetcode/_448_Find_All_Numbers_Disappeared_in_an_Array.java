package com.hama.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: rns
 * @Date: 2019/2/1 上午11:25
 * @Description: _448_Find_All_Numbers_Disappeared_in_an_Array
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 *
 * Example:
 *
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [5,6]
 */
public class _448_Find_All_Numbers_Disappeared_in_an_Array {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] ns = new int[n];
        for (int i = 0; i < nums.length; i++) {
            ns[nums[i]-1] = 1;
        }
        List<Integer> result = new ArrayList<>();

        for (int j = 0; j < ns.length; j++) {
            if(ns[j] == 0){
                result.add(j+1);
            }
        }

        return result;
    }

    public static void main(String [] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
