package com.pc.singleton;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author pengchao
 * @since 2022/11/28 15:54
 */
public class SingletonV2 {

    private String name;
    public static SingletonV2 INSTANCE = null;

    private static final ReadWriteLock rwLock = new ReentrantReadWriteLock();

    private SingletonV2() {
        //模拟初始化时间
//        try {
//            TimeUnit.MILLISECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public static SingletonV2 getInstance() {
        rwLock.readLock().lock();
        if (INSTANCE != null) {
            rwLock.readLock().unlock();
            return INSTANCE;
        }
        rwLock.readLock().unlock();

        rwLock.writeLock().lock();
        if (INSTANCE == null) {
            INSTANCE = new SingletonV2();
        }
        rwLock.writeLock().unlock();
        return INSTANCE;
    }

    public static void clear() {
        INSTANCE = null;
    }
}
