package com.hama.sword._002_单例设计模式;

/**
 * @Author: rns
 * @Date: 2018/12/17 下午4:27
 * @Description: Singleton_innerstaticclass
 */
public class Singleton_innerstaticclass {

    private Singleton_innerstaticclass() {
    }

    private static Singleton_innerstaticclass getInstance() {
        return SingletonProvider.singleton;
    }

    private static class SingletonProvider {
        private static final Singleton_innerstaticclass singleton = new Singleton_innerstaticclass();
    }
}
