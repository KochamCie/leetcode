package com.hama.ext.sort;

/**
 * @Author: rns
 * @Date: 2018/12/23 下午9:47
 * @Description: QuickSort
 *
 * 采用分治思想，选出个"基准"值pivot，取中间位置的数也就是arr[(head+tail)/2]，小于基准的放到左边，大于基准的放到右边
 * 平均时间O(nlogn)，最坏为O(n^2)，不稳定，n大时比较好
 *
 */
public class QuickSort {

    public int[] quickSort(int[] arr, int head, int tail){
        if (head >= tail || arr == null || arr.length <= 1) {
            return arr;
        }
        int i = head, j = tail;           // 头尾的index  
        int pivot = arr[(head + tail) / 2];// 中间的值value
        while (i <= j) {
            while (arr[i] < pivot) {
                ++i;
            }
            while (arr[j] > pivot) {
                --j;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }

        quickSort(arr, head, j);
        quickSort(arr, i, tail);
        return arr;
    }


    public static void main(String [] args){
        int[] arr = {2,5,3,6,7,8,1,9,4,0};
        QuickSort sort = new QuickSort();
        sort.quickSort(arr, 0, arr.length-1);
        Sort.display(arr);
    }


}
