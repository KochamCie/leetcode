package com.hama.array.medianTowSortedArray;

/**
 * Median of Two Sorted Arrays
 * there are two sorted arrays nums1 and nums2 of size m and n respectively
 * find the median of the two sorted arrays.
 * the overall run time complexity should be O(log(m+n))
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * the median is (2 + 3)/2 = 2.5
 * <p>
 * <p>
 * Created by rns on 2017/3/29.
 */
public class Solution {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        return 0;
    }

    public static double findMedian(int[] nums) {
        int length = nums.length;
        int temp = length / 2;
        if (length % 2 == 0) {
            return (nums[temp - 1] + nums[temp]) / 2.0;
        } else {
            return nums[temp];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4, 5};
        int k = nums1.length + nums2.length;
        System.out.println(findMedian(nums1));
        System.out.println(findMedian(nums2));
        getKth(nums1, 0, nums2, 0, 5);
        //System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double getKth(int[] nums1, int start1, int[] nums2, int start2, int k) {

        // array's length
        int m = nums1.length;
        int n = nums2.length;

        // cal the median of
        double nums1_median = findMedian(nums1);
        double nums2_median = findMedian(nums2);

        // case

        if (nums1_median < nums2_median) {
        }


        return 0;
    }
}
