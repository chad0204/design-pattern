package com.pc.decorator.demo.sizedecorator;

import com.pc.decorator.demo.Beverage;

/**
 * @author dx
 * @className SizeDecorator
 * @description 尺寸装饰类
 * @date 2019-07-27 15:14
 */
public abstract class SizeDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();

}
