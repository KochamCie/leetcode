package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午4:37
 * @Description: _504_Base_7
 * <p>
 * Given an integer, return its base 7 string representation.
 * <p>
 * Example 1:
 * Input: 100
 * Output: "202"
 * Example 2:
 * Input: -7
 * Output: "-10"
 * Note: The input will be in range of [-1e7, 1e7].
 */
public class _504_Base_7 {

    private static final int BASE = 7;

    public static String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean neg = num<0;
        if(neg){
            num = -num;
        }
        StringBuffer sb = new StringBuffer();
        while(num>0){
            int left = num%7;
            sb.append(left);
            num = num/7;
        }
        if(neg){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
    public static void main(String [] args){
        System.out.println(convertToBase7(0));
    }
}
