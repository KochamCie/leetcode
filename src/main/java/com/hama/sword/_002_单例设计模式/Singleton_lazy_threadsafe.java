package com.hama.sword._002_单例设计模式;

/**
 * @Author: rns
 * @Date: 2018/12/17 下午4:18
 * @Description: Singleton_lazy_threadsafe
 */
public class Singleton_lazy_threadsafe {

    private Singleton_lazy_threadsafe() {
    }

    private static Singleton_lazy_threadsafe singleton;

    public static synchronized Singleton_lazy_threadsafe getInstance() {
        if (null == singleton) {
            singleton = new Singleton_lazy_threadsafe();
        }
        return singleton;
    }

}
