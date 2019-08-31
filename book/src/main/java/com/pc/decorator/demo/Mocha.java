package com.pc.decorator.demo;

/**
 * @author dx
 * @className Mocha
 * @description 具体的装饰者 摩卡
 * @date 2019-07-27 14:45
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
}
