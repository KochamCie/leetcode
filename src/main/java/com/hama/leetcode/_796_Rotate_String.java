package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/1/31 下午5:25
 * @Description: _796_Rotate_String
 * We are given two strings, A and B.
 *
 * A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
 * For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
 * Return True if and only if A can become B after some number of shifts on A.
 *
 * Example 1:
 * Input: A = 'abcde', B = 'cdeab'
 * Output: true
 *
 * Example 2:
 * Input: A = 'abcde', B = 'abced'
 * Output: false
 * Note:
 *
 * A and B will have length at most 100.
 */
public class _796_Rotate_String {

    public static boolean rotateString(String A, String B) {
        if(null == A || null == B) return false;
        if(A.length() != B.length()) return false;
        String C = A + A;
        return C.contains(B);
    }

    public static void main(String [] args){
        String A = "abcde", B = "cdeab";
        System.out.println(rotateString(A, B));
    }
}
