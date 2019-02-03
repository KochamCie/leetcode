package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午5:01
 * @Description: _088_Merge_Sorted_Array
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
public class _088_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=nums1.length-1;
        while(m>0 && n>0){
            if(nums1[m-1]>=nums2[n-1]){
                nums1[i] = nums1[m-1];
                m--;
            } else {
                nums1[i] = nums2[n-1];
                n--;
            }
            i--;
        }
        n--;
        while(n>-1){
            nums1[i--] = nums2[n--];
        }
    }

    public static void main(String [] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.println(i);
        }

    }
}
