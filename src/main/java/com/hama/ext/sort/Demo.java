package com.hama.ext.sort;

/**
 * @Author: rns
 * @Date: 2019/2/20 上午10:43
 * @Description: Demo
 */
public class Demo implements Sort {


    public int[] bubbleSort(int[] arr) {
        if (null == arr || arr.length < 2) return arr;
        for (int i = 0; i < arr.length; i++) {
            // 取0到i之间的数，判断j和j之后的数去替换。-1防止溢出
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        Sort.display(arr);
        return arr;
    }


    public int[] insertSort(int[] arr) {
        if (null == arr || arr.length < 2) return arr;
        // 从第二个开始。j刚好等于抓起的数i。j比前一位小则替换。j--
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        Sort.display(arr);
        return arr;
    }


    public int[] quickSort(int[] arr, int head, int tail) {
        if (head >= tail || null == arr || arr.length < 2) return arr; // 递归出口
        // 每次将基准值摆在正确的位置
        int i = head, j = tail, pivot = arr[head];  // 基准值取最左值
        while (i <= j) {    // 两个下标的情况

            while (arr[i] < pivot) {
                ++i;
            }

            while (arr[j] > pivot) {
                --j;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
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


    public int[] selectSort(int arr[]) {
        if (null == arr || arr.length < 2) return arr;
        // 每趟都找出最小的值进行摆放
        for(int i = 0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                // 逐渐摆放
                if(arr[j] < arr[i]){
                    int temp= arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        Sort.display(arr);
        return arr;
    }



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

    public static int binarySearch(int[] arr, int des) {
        int left = 0;
        int right = arr.length - 1;
        // 二分查找。前提arr有序
        while (left <= right) {
            int middle = (left + right)>>>1 ;
            if (des == arr[middle]) {
                return middle;
            } else if (des < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.bubbleSort(new int[]{2, 5, 3, 6, 7, 8, 1, 9, 4, 0});
        demo.insertSort(new int[]{2, 5, 3, 6, 7, 8, 1, 9, 4, 0});
        int[] arr = {2, 5, 3, 6, 7, 8, 1, 9, 4, 0};
        demo.quickSort(arr, 0, arr.length - 1);
        Sort.display(arr);
        demo.selectSort(new int[]{2, 5, 3, 6, 7, 8, 1, 9, 4, 0});
        System.out.println();
        System.out.println(demo.binarySearch(arr, 6));


    }

    @Override
    public int[] sort(int[] arr) {
        return new int[0];
    }

}
