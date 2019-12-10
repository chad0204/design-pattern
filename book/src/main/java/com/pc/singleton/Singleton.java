package com.pc.singleton;

/**
 * @author dx
 * @className Singleton
 * @description 双重检查
 * @date 2019-08-04 17:05
 */
public class Singleton {

    private volatile static Singleton singleton;//volatile保证初始化的三步操作线程安全

    private Singleton() {}


    //加synchronized可以防止多线程情况下创建了多个实例，但同步会损耗性能，并且锁只在第一次实例化
    //时起到作用，实例创建完成后锁就变成了累赘。
    public static Singleton getInstance() {
        if(singleton==null) {
            synchronized (Singleton.class) {
                if(singleton==null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }




}
