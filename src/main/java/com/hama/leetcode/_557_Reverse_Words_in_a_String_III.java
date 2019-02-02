package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午4:39
 * @Description: _557_Reverse_Words_in_a_String_III
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class _557_Reverse_Words_in_a_String_III {
    public static String reverseWords(String s) {
        String result = null;
        if (null != s) {
            String[] strings = s.split(" ");
            for (String string : strings) {
                StringBuffer sb = new StringBuffer(string);
                result = null == result ? sb.reverse().toString() : String.join(" ", result, sb.reverse().toString());
            }
        }
        return result;
    }

    // better
    public static String reverseWords2(String s) {
        String result = null;
        if(null != s){
            String[] strings = s.split(" ");
            for(int i=0; i<strings.length; i++){
                strings[i] = new StringBuffer(strings[i]).reverse().toString();
            }
            result = String.join(" ", strings);
        }
        return result;
    }
    public static void main(String[] args) {
        String test = "Let's take LeetCode contest";
        System.out.println(reverseWords(test).equals("s'teL ekat edoCteeL tsetnoc"));
        System.out.println(reverseWords2(test).equals("s'teL ekat edoCteeL tsetnoc"));
    }
}
