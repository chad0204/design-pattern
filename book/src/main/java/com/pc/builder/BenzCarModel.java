package com.pc.builder;

/**
 *
 * @author pengchao
 * @date 15:42 2022/7/17
 */
public class BenzCarModel extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("奔驰启动");
    }

    @Override
    protected void light() {
        System.out.println("奔驰开灯");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰响喇叭");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰熄火");
    }
}
