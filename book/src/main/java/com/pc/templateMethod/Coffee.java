package com.pc.templateMethod;

/**
 * @author dx
 * @className Coffee
 * @description 咖啡重写了钩子方法，这样调料就没法加了
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
