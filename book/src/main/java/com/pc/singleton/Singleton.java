package com.pc.singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author dx
 * @className Singleton
 * @description 双重检查
 * @date 2019-08-04 17:05
 */
public class Singleton {

    //volatile保证new初始化的三步操作线程安全。比如如果指针引用先发生，那么其他线程可能拿到一个未初始化完全的对象。
    private volatile static Singleton singleton;


    private Long id;
    private String name;

    private Singleton() {
        //模拟初始化时间
//        try {
//            TimeUnit.MILLISECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public static Singleton getInstance() {
        if (singleton == null) {// 1. 第一次初始化完成后, 避免后续无效加锁的性能损耗
            synchronized (Singleton.class) {// 2. 同步初始化, 同一时间只允许一个线程进行初始化。
                if(singleton == null) {// 3. 防止当前线程初始化完毕后 阻塞在2的线程进入并重新初始化。
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void clear() {
        singleton = null;
    }


}
