package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/1 上午11:38
 * @Description: _844_Backspace_String_Compare
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 *
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 *
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 *
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 *
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * Follow up:
 *
 * Can you solve it in O(N) time and O(1) space?
 */
public class _844_Backspace_String_Compare {
    public static boolean backspaceCompare(String S, String T) {

        char[] chars = S.toCharArray();
        for (int i = chars.length - 1; i >= 1; i--) {
            if(chars[i] == '#'){
                chars[i-1] = '#';
            }
        }

        char[] chars2 = T.toCharArray();
        for (int i = chars2.length - 1; i >= 1; i--) {
            if(chars2[i] == '#'){
                chars2[i-1] = '#';
            }
        }

        System.out.println(new String(chars));
        System.out.println(new String(chars2));

        return new String(chars).equals(new String(chars2));
    }

    public static void main(String [] args){
        String S = "a##cc", T = "cc";
        System.out.println(backspaceCompare(S, T));
    }
}
