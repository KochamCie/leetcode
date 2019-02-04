package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/4 下午11:25
 * @Description: _125_Valid_Palindrome
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * <p>
 * Input: "race a car"
 * Output: false
 */
public class _125_Valid_Palindrome {

    public static boolean isPalindrome(String s) {
        String string = s.replaceAll("[^A-Za-z0-9]", "").toUpperCase();
        return new StringBuffer(string).reverse().toString().equals(string);
    }

    public static void main(String [] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

}
