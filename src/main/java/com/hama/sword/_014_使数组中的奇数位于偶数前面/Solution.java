package com.hama.sword._014_使数组中的奇数位于偶数前面;

/**
 * @Author: rns
 * @Date: 2018/12/18 下午8:29
 * @Description: Solution
 *
 * 奇数在前，偶数在后
 */
public class Solution {

    public static int[] reorder(int[] a) {

        int firstIndex = 0;
        int lastIndex = a.length -1;

        while (firstIndex<lastIndex){
            System.out.println("in big while........"+firstIndex+","+lastIndex);
            // 指向偶数
            while ((a[firstIndex] & 1) != 0){
                firstIndex++;
            }
            System.out.println("after first index while:"+firstIndex);
            while ((a[lastIndex] &1) == 0){
                lastIndex--;
            }
            System.out.println("after last index while:"+lastIndex);

            if(firstIndex < lastIndex){
                System.out.println("needs swap......");
                int temp = a[firstIndex];
                a[firstIndex] = a[lastIndex];
                a[lastIndex] = temp;
            }
            System.out.println();
        }


        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        for (int i : reorder(a)) {
            System.out.println(i);
        }
    }
}
