package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/1/31 下午7:05
 * @Description: _693_Binary_Number_with_Alternating_Bits
 * <p>
 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
 * <p>
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation:
 * The binary representation of 5 is: 101
 * Example 2:
 * Input: 7
 * Output: False
 * Explanation:
 * The binary representation of 7 is: 111.
 * Example 3:
 * Input: 11
 * Output: False
 * Explanation:
 * The binary representation of 11 is: 1011.
 * Example 4:
 * Input: 10
 * Output: True
 * Explanation:
 * The binary representation of 10 is: 1010.
 *
 */
public class _693_Binary_Number_with_Alternating_Bits {

    public static boolean hasAlternatingBits(int n) {

        int m = n>>1;
        if(m+n<0){
            return false;
        }
        int num = m+n+1;

        while(num>1){
            if((num&1) == 0){
                num = num >> 1;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 1010101010101010101010101010110
     *  101010101010101010101010101011
     *
     *
     * @param args
     */
    public static void main(String [] args){
        System.out.println(hasAlternatingBits(1431655765));
    }
}
