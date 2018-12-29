package com.hama.sword._002_单例设计模式;

import com.hama.sword.BaseSolution;

public class Solution extends BaseSolution {

    public static void main(String [] args){

        Singleton_db_check singleton_db_check1 = Singleton_db_check.getInstance();
        Singleton_db_check singleton_db_check2 = Singleton_db_check.getInstance();
        System.out.println(singleton_db_check1 == singleton_db_check2);

    }
}
