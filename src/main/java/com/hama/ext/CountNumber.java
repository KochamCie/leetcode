package com.hama.ext;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: rns
 * @Date: 2018/12/26 下午8:08
 * @Description: CountNumber
 */
public class CountNumber {

     static  int i = 0;

    public static void main(String [] args){

        new Thread(new MyThread(), "1").start();
        new Thread(new MyThread(), "2").start();
        new Thread(new MyThread(), "3").start();
        new Thread(new MyThread(), "4").start();
        new Thread(new MyThread(), "5").start();

    }

    static class MyThread extends Thread {


        @Override
        public void run() {


            i++;
            System.out.println(Thread.currentThread().getName()+":"+i);

        }
    }

}
