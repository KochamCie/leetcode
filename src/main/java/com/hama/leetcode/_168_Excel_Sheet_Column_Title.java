package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/8 下午11:55
 * @Description: _168_Excel_Sheet_Column_Title
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * For example:
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * Example 1:
 *
 * Input: 1
 * Output: "A"
 * Example 2:
 *
 * Input: 28
 * Output: "AB"
 * Example 3:
 *
 * Input: 701
 * Output: "ZY"
 */
public class _168_Excel_Sheet_Column_Title {

    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n>0){
            n--;
            int left = n % 26;
            result.insert(0, (char)('A' + left));
            n = n/26;
        }
        return result.toString();
    }

}
