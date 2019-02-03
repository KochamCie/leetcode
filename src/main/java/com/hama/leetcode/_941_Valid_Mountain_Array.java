package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/1 上午11:39
 * @Description: _941_Valid_Mountain_Array
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that A is a mountain array if and only if:
 * <p>
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[B.length - 1]
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [2,1]
 * Output: false
 * Example 2:
 * <p>
 * Input: [3,5,5]
 * Output: false
 * Example 3:
 * <p>
 * Input: [0,3,2,1]
 * Output: true
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 */
public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] A) {
        if (A.length < 3 || A[0] >= A[1]) return false;
        boolean asc = true;
        for (int i = 0, j = i + 1; i < A.length - 1; i++, j++) {
            if (asc && A[i] >= A[j]) {
                asc = false;
            }
            if (!asc) {
                if (A[i] <= A[j]) {
                    return false;
                }
            }

        }
        if (asc) return false;
        return true;
    }

    // better
    public static boolean validMountainArray2(int[] A) {
        if (A.length < 3 || A[0] >= A[1]) return false;

        int i = 1;    // at the left of mountain

        while (i < A.length - 1 && A[i] > A[i - 1]) {
            ++i;
        }

        while (i < A.length && A[i] < A[i - 1]) {
            ++i;
        }

        return i == A.length;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 1, 2};
        System.out.println(validMountainArray(A));
        System.out.println(validMountainArray2(A));
    }
}
