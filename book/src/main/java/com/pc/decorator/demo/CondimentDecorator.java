package com.pc.decorator.demo;

/**
 * @author dx
 * @className CondimentDecorator
 * @description 调料装饰类
 * @date 2019-07-27 14:33
 */
public abstract class CondimentDecorator extends Beverage {//装饰者必须能取代被装饰者，所以要是同一类型

    public abstract String getDescription();

    //价格计算交个具体的调料实现类
}
