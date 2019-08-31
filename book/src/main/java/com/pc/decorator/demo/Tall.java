package com.pc.decorator.demo;

/**
 * @author dx
 * @className Tall
 * @description 小杯
 * @date 2019-07-27 15:16
 */
public class Tall extends SizeDecorator {

    private Beverage beverage;

    public Tall(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Tall";
    }

    @Override
    public double cost() {
        return beverage.cost() * 0.7;
    }
}
