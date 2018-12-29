package com.hama.ext.sort;

/**
 * @Author: rns
 * @Date: 2018/12/23 下午9:47
 * @Description: BubbleSort
 *
 * 整个过程就像气泡一样往上升，从第一个记录开始依次对比相邻的两个记录，当前面大于后面时交换位置
 * 最好时间O(n)，平均为O(n^2)，稳定，n较小时比较好
 *
 */
public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=arr.length-1 ; j>i; j--){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        Sort.display(arr);
        return arr;
    }



    public static void main(String [] args){
        int[] arr = {2,5,3,6,7,8,1,9,4,0};
        BubbleSort sort = new BubbleSort();
        sort.sort(arr);
    }

}
