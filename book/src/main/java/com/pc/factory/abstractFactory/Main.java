package com.pc.factory.abstractFactory;

import com.pc.factory.Pizza;
import com.pc.factory.abstractFactory.pizzaStore.NYPizzaStore;
import com.pc.factory.factoryMethod.pizzaStore.PizzaStore;

/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-08-03 14:54
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();//选什么子类，就得到什么对象
        Pizza pizza = pizzaStore.orderPizza("chess");
    }
}
