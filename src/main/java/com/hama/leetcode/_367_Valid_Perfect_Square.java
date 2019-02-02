package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午5:00
 * @Description: _367_Valid_Perfect_Square
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * <p>
 * Note: Do not use any built-in library function such as sqrt.
 * <p>
 * Example 1:
 * <p>
 * Input: 16
 * Output: true
 * Example 2:
 * <p>
 * Input: 14
 * Output: false
 */
public class _367_Valid_Perfect_Square {
    /**
     * 1    1
     * 4    3
     * 9    5
     * 16   7
     * 25   9
     * 36   11
     * 49   13
     * ==>  1+3+5+7+9....
     * ==>  num>0 num-1, num-3, num-5, num-7, num-9, ... , num-i
     *
     * @param num
     * @return
     */
    public static boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            System.out.println(isPerfectSquare(i));
        }
    }
}
