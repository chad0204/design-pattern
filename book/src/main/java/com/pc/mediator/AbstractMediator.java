package com.pc.mediator;

/**
 *
 * @author pengchao
 * @date 11:08 2022/8/13
 */
public abstract class AbstractMediator {//any 子类 包下 class

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    //事件方法，用来处理多个对象的关系
    public abstract void execute(String biz, Object... objects);
}
