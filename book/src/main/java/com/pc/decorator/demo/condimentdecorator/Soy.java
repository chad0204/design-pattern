package com.pc.decorator.demo.condimentdecorator;

import com.pc.decorator.demo.Beverage;

/**
 * @author dx
 * @className Soy
 * @description 具体的装饰者 豆浆
 * @date 2019-07-27 14:53
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return 0.3+beverage.cost();
    }
}

