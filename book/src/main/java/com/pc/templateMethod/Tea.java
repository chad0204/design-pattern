package com.pc.templateMethod;

/**
 * @author dx
 * @className Tea
 * @description TODO
 * @date 2019-08-13 15:56
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    public void brew() {
        System.out.println("浸泡");
    }
}
