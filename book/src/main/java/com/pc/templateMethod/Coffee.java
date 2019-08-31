package com.pc.templateMethod;

/**
 * @author dx
 * @className Coffee
 * @description TODO
 * @date 2019-08-13 15:56
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("加奶和糖");
    }

    @Override
    public void brew() {
        System.out.println("冲调");
    }

    @Override
    public boolean hook() {
        return false;
    }
}
