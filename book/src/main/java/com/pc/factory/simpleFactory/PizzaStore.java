package com.pc.factory.simpleFactory;

import com.pc.factory.Pizza;

/**
 * @author dx
 * @className factoryMethod
 * @description 客户端类，可能有很多客户端类要用到工厂
 * @date 2019-08-02 16:38
 */
public class PizzaStore {

    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
