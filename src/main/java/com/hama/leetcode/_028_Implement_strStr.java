package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/4 下午11:21
 * @Description: _028_Implement_strStr
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class _028_Implement_strStr {
    public int strStr(String haystack, String needle) {

        if ("".equals(needle)) return 0;
        return haystack.indexOf(needle);

    }
}
