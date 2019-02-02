package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午4:45
 * @Description: _66_Plus_One
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class _66_Plus_One {

    public int[] plusOne(int[] digits) {

        int carry = 0;
        for(int i=digits.length-1; i>=0; i--){
            int value = digits[i];
            if(i == digits.length-1){
                value += 1;
            }
            int left = (value+carry)%10;
            carry = (value+carry)/10;
            digits[i] = left;
        }
        if(carry == 1){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for(int j= 0;j< digits.length; j++){
                result[j+1] = digits[j];
            }
            return result;
        }

        return digits;
    }
}
