package com.hama.sword._002_单例设计模式;

/**
 * @Author: rns
 * @Date: 2018/12/17 下午4:31
 * @Description: Singleton_db_check
 */
public class Singleton_db_check {
    private Singleton_db_check() {
    }

    private volatile static Singleton_db_check singleton = null;

    public static Singleton_db_check getInstance() {

        synchronized (Singleton_db_check.class) {

            if (null == singleton) {
                singleton = new Singleton_db_check();

            }
            return singleton;
        }
    }
}
