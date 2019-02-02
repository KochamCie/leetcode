package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午4:03
 * @Description: _167_Two_Sum_II_Input_array_is_sorted
 * <p>
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * <p>
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class _167_Two_Sum_II_Input_array_is_sorted {

    public static int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue;
                if (temp == numbers[j] && i < j) {
                    return new int[]{i + 1, j + 1};
                }
            }


        }
        return new int[]{};
    }

    // better
    // the array is sorted, we can use two opposite cursor to move
    // each input would have exactly one solution
    public static int[] twoSum2(int[] numbers, int target) {
        if (null == numbers || numbers.length < 2) return new int[]{};

        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left] + numbers[right];
            if (temp == target) {
                return new int[]{left + 1, right + 1};
            } else if (temp > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int[] numbers = {7, 2, 11, 15};
        for (int i : twoSum2(numbers, 9)) {
            System.out.println(i);
        }
    }
}
