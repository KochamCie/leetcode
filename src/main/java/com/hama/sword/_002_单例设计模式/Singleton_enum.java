package com.hama.sword._002_单例设计模式;

/**
 * @Author: rns
 * @Date: 2018/12/17 下午4:29
 * @Description: Singleton_enum
 */
public class Singleton_enum {
    private Singleton_enum() {

    }

    public static Singleton_enum getInstance() {
        return Singleton.SINGLETON.getSingleton();
    }

    private static enum Singleton {

        SINGLETON;

        private Singleton_enum singleton;

        private Singleton() {
            singleton = new Singleton_enum();
        }

        public Singleton_enum getSingleton() {
            return singleton;
        }
    }

}
