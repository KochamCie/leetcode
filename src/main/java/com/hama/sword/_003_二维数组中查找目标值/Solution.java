package com.hama.sword._003_二维数组中查找目标值;

/**
 * @Author: rns
 * @Date: 2018/12/13 下午4:31
 * @Description: 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入一个这样的二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {

    /**
     * O(n^2)
     *
     * @param array
     * @param target
     * @return
     */
    private static boolean find(int[][] array, int target) {
        if (null == array) return false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("数组中含有该整数，位置为[" + i + "][" + j + "]");
                    return true;
                }
            }
        }
        System.out.println("数组中不含有该整数");
        return false;
    }

    private static boolean find_v2(int[][] array, int target) {
        if (null == array) return false;
        int row = 0;
        int col = array[row].length - 1;

        while (row < array.length && col >= 0) {
            if (target == array[row][col]) {
                System.out.println("数组中含有该整数，位置为[" + row + "][" + col + "]");
                return true;
            }

            if (target < array[row][col]) {
                col--;
            } else {
                row++;
                col = array[row].length-1;
            }
        }
        System.out.println("数组中不含有该整数");
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6}, {2, 3, 4, 5, 6, 7, 8}};
        find(array, 8);
        find_v2(array, 8);

    }
}
