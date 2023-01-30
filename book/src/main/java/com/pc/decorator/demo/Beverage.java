package com.pc.decorator.demo;

/**
 * @author dx
 * @className Beverage
 * @description 饮料
 * @date 2019-07-27 14:30
 */
public abstract class Beverage {

    protected String description = "UnKnown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();


}
