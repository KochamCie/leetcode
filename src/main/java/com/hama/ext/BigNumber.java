package com.hama.ext;

import java.math.BigDecimal;

/**
 * @Author: rns
 * @Date: 2018/12/23 下午4:27
 * @Description: BigNumber
 */
public class BigNumber {


    public static int[] multiple(String str1, String str2) {
        int l = str1.length(), r = str2.length();
        int[] num1 = new int[l], num2 = new int[r], result = new int[l + r];

        // num1
        for (int i = 0; i < l; i++) {
            num1[i] = str1.charAt(i) - '0';
        }

        // num2
        for (int j = 0; j < r; j++) {
            num2[j] = str2.charAt(j) - '0';
        }

        for (int m = l - 1; m >= 0; m--) {
            for (int n = r - 1; n >= 0; n--) {
                result[m + n + 1] += num1[m] * num2[n];
            }
        }

        // 注意m应大于0，避免越界
        for (int m = result.length - 1; m > 0; m--) {
            result[m - 1] += result[m] / 10;
            result[m] = result[m] % 10;
        }

        displayArray(result);
        return result;
    }

    /**
     * skip front zero
     *
     * @param arr
     */
    public static void displayArray(int[] arr) {
        System.out.println();
        boolean display = false;
        for (int i : arr) {
            if (display) {
                System.out.print(i);
            } else {
                if (i != 0) {
                    display = true;
                    System.out.print(i);
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String num3 = "123456789";
        String num4 = "123456789";

        multiple(num3, num4);

        BigDecimal a = new BigDecimal(123456789);
        BigDecimal b = new BigDecimal(123456789);
        System.out.println(a.multiply(b));
    }

}
