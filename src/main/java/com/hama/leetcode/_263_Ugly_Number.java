package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/1/22 下午9:38
 * @Description: _263_Ugly_Number
 */
public class _263_Ugly_Number {

    public boolean isUgly(int num) {
        if(num<=0) return false;
        for(int i=2; i<=5; i++){
            while(num%i == 0){
                num /= i;
            }
        }
        return num == 1;
    }
}
