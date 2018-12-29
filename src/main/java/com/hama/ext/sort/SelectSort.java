package com.hama.ext.sort;

/**
 * @Author: rns
 * @Date: 2018/12/23 下午6:03
 * @Description: SelectSort
 *
 * 选择排序，每轮的结果都会找出未排序元素中的最小值，比如第n轮找出的元素，与n-1位置的元素替换
 * 第二层循环j起始值为第一层循环i+1，j=i+1
 * 平均时间为O(n^2)，不稳定，n较小时较好
 *
 */
public class SelectSort implements Sort {

    /**
     *
     * @param arr
     * @return
     */
    public int[] sort(int[] arr){
        if(null == arr) return null;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("i="+i+",j="+j+",arr[i]="+arr[i]+",arr[j]="+arr[j]);
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            Sort.display(arr);
        }
        Sort.display(arr);
        return arr;
    }


    public static void main(String [] args){
        int[] arr = {2,5,3,6,7,8,1,9,4};
        SelectSort sort = new SelectSort();
        sort.sort(arr);
    }

}
