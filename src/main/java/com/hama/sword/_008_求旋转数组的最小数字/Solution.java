package com.hama.sword._008_求旋转数组的最小数字;

import com.hama.sword.BaseSolution;

/**
 * @Author: rns
 * @Date: 2019/1/31 下午4:00
 * @Description: Solution
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * 给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 */
public class Solution extends BaseSolution {

    /**
     * 输入的是一个非递减排序的数组的一个旋转，可将数组重新排序，
     * @param input
     * @return
     */
    public static int min(int[] input){
        if(0 == input.length) return  0;





        return 0;
    }


    public static void main(String [] args){
        int[] input = {3,4,5,1,2};
        System.out.println(min(input));
    }
}
