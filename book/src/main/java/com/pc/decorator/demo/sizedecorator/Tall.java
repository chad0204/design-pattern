package com.pc.decorator.demo.sizedecorator;

import com.pc.decorator.demo.Beverage;

/**
 * @author dx
 * @className Tall
 * @description 小杯
 * @date 2019-07-27 15:16
 */
public class Tall extends SizeDecorator {


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
