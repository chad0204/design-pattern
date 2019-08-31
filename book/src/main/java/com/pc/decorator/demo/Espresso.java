package com.pc.decorator.demo;

/**
 * @author dx
 * @className Espresso
 * @description 蒸馏咖啡
 * @date 2019-07-27 14:39
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }


    @Override
    public double cost() {
        return 1.99;
    }
}
