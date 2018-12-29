package com.hama.sword._002_单例设计模式;

/**
 * @Author: rns
 * @Date: 2018/12/17 下午4:20
 * @Description: Singleton_hungry
 */
public class Singleton_hungry {

    private Singleton_hungry() {
    }

    private static Singleton_hungry singleton = new Singleton_hungry();

    public static Singleton_hungry getInstance() {
        return singleton;
    }
}
