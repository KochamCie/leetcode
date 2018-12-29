package com.hama.sword._002_单例设计模式;

/**
 * @Author: rns
 * @Date: 2018/12/17 下午4:10
 * @Description: Singleton_lazy
 */
public class Singleton_lazy {

    private Singleton_lazy() {
    }

    private static Singleton_lazy singletonLazy = null;

    public static Singleton_lazy getInstance() {

        if (null == singletonLazy) {
            singletonLazy = new Singleton_lazy();
        }
        return singletonLazy;
    }
}
