package com.pc.decorator.demo;

/**
 * @author dx
 * @className Houseblend
 * @description 混合咖啡
 * @date 2019-07-27 14:41
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
