package com.hama.sword._002_单例设计模式;

/**
 * @Author: rns
 * @Date: 2018/12/17 下午4:23
 * @Description: Singleton_hungry_staticinit
 */
public class Singleton_hungry_staticinit {

    private Singleton_hungry_staticinit() {
    }

    private static Singleton_hungry_staticinit singleton;

    static {
        singleton = new Singleton_hungry_staticinit();
    }

    public static Singleton_hungry_staticinit getInstance() {
        return singleton;
    }
}
