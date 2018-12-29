package com.hama.ext.sort;

/**
 * @Author: rns
 * @Date: 2018/12/23 下午6:01
 * @Description: InsertSort
 *
 * 插入排序，生活场景可以理解成打扑克牌，保证抓第n张牌时，手中n-1张是有序的
 * 最好时间O(n)，平均是O(n^2)，稳定，大部分有序比较好
 *
 */
public class InsertSort implements Sort {


    /**
     *
     * @param arr
     * @return
     */
    @Override
    public int[] sort(int[] arr) {

        // 从第二张牌开始
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j=i; // temp为抽出来的牌
            if(temp < arr[j-1]){
                // 达到往前排插入的条件，当前面有多张时，需要进行多次调换。将temp向前移动对比
                while(j>=1&&temp<arr[j-1]){
                    arr[j]=arr[j-1];
                    j--;
                }
                // 此时的j位置，就是牌需要插入的地方
                arr[j] = temp;
            }
        }
        Sort.display(arr);
        return arr;
    }


    public static void main(String [] args){
        int[] arr = {2,5,3,6,7,8,1,9,4,0};
        InsertSort sort = new InsertSort();
        sort.sort(arr);
    }

}
