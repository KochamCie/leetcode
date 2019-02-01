package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/1 上午11:36
 * @Description: _342_Power_of_Four
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * <p>
 * Example 1:
 * <p>
 * Input: 16
 * Output: true
 * Example 2:
 * <p>
 * Input: 5
 * Output: false
 */
public class _342_Power_of_Four {
    public static boolean isPowerOfFour(int num) {
        if (num == 1) return true;
        if (num < 1 || num % 4 != 0) return false;
        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            num = num / 4;

        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "=======" + isPowerOfFour(i));

        }
    }
}
