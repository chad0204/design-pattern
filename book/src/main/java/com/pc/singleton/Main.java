package com.pc.singleton;


/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-08-04 17:28
 */
public class Main {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        for(int i = 0;i<100000000;i++) {
            Singleton instance = Singleton.getInstance();
            instance.hashCode();
        }
        System.out.println(System.currentTimeMillis()-time);
    }

}
