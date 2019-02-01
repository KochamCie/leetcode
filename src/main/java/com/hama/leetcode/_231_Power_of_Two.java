package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/1 上午11:27
 * @Description: _231_Power_of_Two
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 *
 * Input: 1
 * Output: true
 * Explanation: 2^0 = 1
 * Example 2:
 *
 * Input: 16
 * Output: true
 * Explanation: 2^4 = 16
 * Example 3:
 *
 * Input: 218
 * Output: false
 */
public class _231_Power_of_Two {

    public static boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        int num = n;
        n = n-1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n+1)==num;
    }





    /**
     * 0000 0
     * 0001 1
     * 0010 2
     * 0011 3
     * 0100 4
     * 0101 5
     * 0110 6
     * 0111 7
     *
     * @param args
     */

    public static void main(String [] args){
        System.out.println(isPowerOfTwo(-4));


    }
}
