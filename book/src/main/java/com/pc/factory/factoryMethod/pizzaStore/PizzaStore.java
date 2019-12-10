package com.pc.factory.factoryMethod.pizzaStore;

import com.pc.factory.Pizza;

/**
 * @author dx
 * @className PizzaStore
 * @description 比较DependentPizzaStore，该类依赖的类更少，更加灵活
 * @date 2019-08-02 21:36
 */
public abstract class PizzaStore {

    //anyOperation
    public final Pizza orderPizza(String type) {
        //Pizza的种类由具体的商店提供
        Pizza pizza = createPizza(type);//依赖倒置，利用的就是jvm的动态绑定
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //子商店类实现,这就是工厂方法，将类的初始化延迟到子类，工厂方法就相当于一个工厂
    protected abstract Pizza createPizza(String type);


}
