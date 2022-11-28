package com.pc.singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author dx
 * @className Singleton
 * @description 双重检查
 * @date 2019-08-04 17:05
 */
public class Singleton {

    //volatile保证初始化的三步操作线程安全。比如如果指针引用先发生，那么其他线程可能拿到一个未初始化完全的对象。
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

    //加synchronized可以防止多线程情况下创建了多个实例，但同步会损耗性能，并且锁只在第一次实例化
    //时起到作用，实例创建完成后锁就变成了累赘。
    public static Singleton getInstance() {
//        if (singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
//        }
        return singleton;
    }

    public static void clear() {
        singleton = null;
    }


}
