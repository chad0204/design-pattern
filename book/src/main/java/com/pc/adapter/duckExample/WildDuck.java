package com.pc.adapter.duckExample;

/**
 * @author dx
 * @className WildDuck
 * @description 目标类
 * @date 2019-08-13 14:16
 */
public class WildDuck implements Duck {
    @Override
    public void gaga() {
        System.out.println("duck gaga");
    }

    @Override
    public void fly() {
        System.out.println("duck fly");
    }
}
