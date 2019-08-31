package com.pc.factory.simpleFactory;

import com.pc.factory.Pizza;

/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-08-02 17:30
 */
public class Main {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("chess");

    }
}
