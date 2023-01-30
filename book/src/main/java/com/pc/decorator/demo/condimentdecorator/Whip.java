package com.pc.decorator.demo.condimentdecorator;

import com.pc.decorator.demo.Beverage;

/**
 * @author dx
 * @className Whip
 * @description 具体的装饰者 奶泡
 * @date 2019-07-27 14:53
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return 0.4+beverage.cost();
    }
}
