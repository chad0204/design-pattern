package com.pc.singleton;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author pengchao
 * @since 2022/11/28 15:54
 */
public class SingletonV3 {

    private String name;
    public static SingletonV3 INSTANCE = null;
    private SingletonV3() {
        //模拟初始化时间
//        try {
//            TimeUnit.MILLISECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public static SingletonV3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonV3();
        }
        return INSTANCE;
    }

    public static void clear() {
        INSTANCE = null;
    }

}
