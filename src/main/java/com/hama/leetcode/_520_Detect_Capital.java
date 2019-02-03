package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午4:39
 * @Description: _520_Detect_Capital
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * <p>
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * <p>
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * Example 1:
 * Input: "USA"
 * Output: True
 * Example 2:
 * Input: "FlaG"
 * Output: False
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
public class _520_Detect_Capital {
    public static boolean detectCapitalUse(String word) {

        int upper = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
            }
        }

        int length = word.length();

        if (upper == length || 0 == upper) return true;

        if (1 == upper && Character.isUpperCase(word.charAt(0))) return true;

        return false;
    }

    public static void main(String[] args) {
        String word = "Flag";
        System.out.println(detectCapitalUse(word));
    }
}
