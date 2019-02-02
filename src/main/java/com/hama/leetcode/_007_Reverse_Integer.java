package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午7:33
 * @Description: _007_Reverse_Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class _007_Reverse_Integer {
    public int reverse(int num) {
        int max = 0x7fffffff;
        int min = 0x80000000;
        if(num>max || num<min){
            return 0;
        }
        boolean negative = false;
        if(num<0){
            negative = true;
            num = num*-1;
        }

        int result = 0;
        while (num>0){
            int residue = num%10;
            if(result>max/10){
                return 0;
            }
            result = result*10+residue;
            num = num/10;
        }
        return negative?-result:result;
    }

}
