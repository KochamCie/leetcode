package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/1/22 下午9:38
 * @Description: _858_Mirror_Reflection
 */
public class _858_Mirror_Reflection {


    public int mirrorReflection(int p, int q) {

        if(0 == q) return 0;
        if(q == p) return 1;
        int i=1;
        while(i>0){
            if((i*q)%p == 0){

                int j = (i*q)/p;

                if((j & 1) == 0){
                    return 0;
                }

                if((i & 1) == 1){
                    return 1;
                } else {
                    return 2;
                }
            }
            i++;
        }
        return 0;
    }

}
