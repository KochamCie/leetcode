package com.hama.sword._010_二进制中1的个数;

import com.hama.sword.BaseSolution;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.MAXIMUM_CAPACITY;

/**
 * @Author: rns
 * @Date: 2018/12/18 上午10:03
 * @Description: Solution
 */
public class Solution extends BaseSolution {

    /**
     * -1 11111111 11111111 11111111 11111111
     * 1：00000000 00000000 00000000 00000001
     * 2：00000000 00000000 00000000 00000010
     * 3：00000000 00000000 00000000 00000011
     * 4：00000000 00000000 00000000 00000100
     * 5：00000000 00000000 00000000 00000101
     * 6：00000000 00000000 00000000 00000110
     * 7：00000000 00000000 00000000 00000111
     *
     * @param num
     * @return
     */
    public static int count(int num) {
        int count = 0;
        if (num > 0) {
            while (num != 0) {
                if ((num & 1) == 1) {
                    count++;
                }
                num = num >> 1;
            }
        } else {
            int temp = 1;
            while (temp == 1) {
                if ((num & temp) == 1) {
                    count++;
                }
                temp = temp << 1;
            }


        }
        return count;
    }

    public static int count2(int n) {
        int count = 0;
        int flag = 1;
        int times = 0;

        while (flag != 0) {

            if ((n & flag) != 0) {
                count++;
            }
            flag <<= 1;
            times++;

        }

        return count;
    }


    public static void main(String[] args) {

        System.out.println(count2(7));
        System.out.println(tableSizeFor(1119));
        System.out.println(for2power(1119));
    }

    static final int tableSizeFor(int cap) {
        System.out.println();
        int n = cap - 1;
        System.out.println(n);
        n |= n >>> 1;
        System.out.println(n);

        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    static final int for2power(int defaultV){
        int a = 1;
        while (a<defaultV){
            a <<= 1;
        }
        return a;
    }
}
