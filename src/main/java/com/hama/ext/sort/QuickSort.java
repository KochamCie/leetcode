package com.hama.ext.sort;

/**
 * @Author: rns
 * @Date: 2018/12/23 下午9:47
 * @Description: QuickSort
 * <p>
 * 采用分治思想，选出个"基准"值pivot，取arr[(head]，小于基准的放到左边，大于基准的放到右边
 * 也就是每轮快排，找到基准值该放的位置
 * 平均时间O(nlogn)，最坏为O(n^2)，不稳定，n大时比较好
 */
public class QuickSort {

    public int[] quickSort(int[] arr, int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) {
            return arr;
        }
        int i = head, j = tail;           // 头尾的index  
        int pivot = arr[head];//
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



    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 6, 7, 8, 1, 9, 4, 0};
        QuickSort sort = new QuickSort();
        sort.quickSort(arr, 0, arr.length - 1);
        Sort.display(arr);
    }


}
