package com.hama.ext.sort;

/**
 * @Author: rns
 * @Date: 2018/12/23 下午9:48
 * @Description: MergeSort
 */
public class MergeSort {

    public int[] mergeSort(int[] arr, int[] result, int start, int end) {
        if (start >= end)   // divide中断条件
            return result;
        int len = end - start;  // 原始数组会进行拆分，所以子数组的长度len为end-start
        int mid = (len >> 1) + start;   // 此时子数组的中间index为len/2+start，记得要加上start，这里的start是基于原始数组的！
        int start1 = start, end1 = mid; // 重新定义一遍方便看清各子数组的起始index
        int start2 = mid + 1, end2 = end;
        mergeSort(arr, result, start1, end1);
        mergeSort(arr, result, start2, end2);

        int k = start;
        // 判断条件呢，先进行交集的再进行下面两个while，从小到大
        while (start1 <= end1 && start2 <= end2){
            // 哪个值小，则result[k++]=arr[which++]，用k++是考虑while循环中的移位
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        // 下面两种情况同上个while赋值
        while (start1 <= end1){
            result[k++] = arr[start1++];
        }
        while (start2 <= end2){
            result[k++] = arr[start2++];
        }
        // 同步一下arr部分
        for (k = start; k <= end; k++){
            arr[k] = result[k];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 6, 7, 8, 1, 9, 4, 0};
        MergeSort sort = new MergeSort();
        int[] result = new int[arr.length];
        sort.mergeSort(arr, result, 0, arr.length - 1);
        Sort.display(arr);
    }

}
