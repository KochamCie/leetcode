package com.hama.sword._011_数值的整数次方;

import com.hama.sword.BaseSolution;

/**
 * @Author: rns
 * @Date: 2018/12/18 下午4:11
 * @Description: Solution
 */
public class Solution extends BaseSolution {

    /**
     * @param base
     * @param exponent
     * @return
     */
    public static double pow(double base, int exponent) {

        // 此项输入，会是无穷值
        if (0 == base && 0 > exponent) {
            return 0;
        }
        double result = divide(base, exponent < 0 ? -exponent : exponent);
        if (exponent < 0) {
            result = 1.0 / result;
        }
        return result;
    }


    /**
     * 需保证输入正指数
     *
     * @param base
     * @param exponent
     * @return
     */
    public static double divide(double base, int exponent) {
        if (0 == exponent) return 1;
        if (1 == exponent) return base;

        double result = divide(base, exponent >> 1);
        result *= result;
        if ((exponent & 1) == 1) {
            // 如果基数为基数时，还需要乘以一次base
            result = result * base;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(pow(3, -3));
        System.out.println(Math.pow(3, -3));

    }


}
