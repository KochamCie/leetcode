package com.hama.sword._004_替换字符串中的空格;

/**
 * @Author: rns
 * @Date: 2018/12/13 下午5:07
 * @Description: Solution
 * 将一个字符串中的空格替换成"%20"
 * 例如，当字符串为We Are Happy。则经过替换后的字符串为We%20Are%20Happy。
 */
public class Solution {

    /**
     * 直接使用String正则相关的替换方法
     *
     * @param source
     * @return
     */
    public static String replace(String source) {
        source = source.replaceAll(" ", "%20");
        return source;
    }

    /**
     *
     * @param source
     * @return
     */
    public static String replace_v2(String source) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            String temp = String.valueOf(source.charAt(i));
            if (" ".equals(temp)) {
                temp = "%20";
            }
            sb.append(temp);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String source = "We Are Happy";
        System.out.println(replace(source));
        System.out.println(replace_v2(source));
    }
}
