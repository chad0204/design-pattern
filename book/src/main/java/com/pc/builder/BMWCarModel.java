package com.pc.builder;

/**
 *
 * @author pengchao
 * @date 15:42 2022/7/17
 */
public class BMWCarModel extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("宝马启动");
    }

    @Override
    protected void light() {
        System.out.println("宝马开灯");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马响喇叭");
    }

    @Override
    protected void stop() {
        System.out.println("宝马熄火");
    }
}
