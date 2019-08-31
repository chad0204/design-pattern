package com.pc.factory.factoryMethod;


import com.pc.factory.factoryMethod.pizzaStore.NYPizzaStore;
import com.pc.factory.factoryMethod.pizzaStore.PizzaStore;
import com.pc.factory.Pizza;

/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-08-02 22:24
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();//选什么子类，就得到什么对象
        Pizza pizza = pizzaStore.orderPizza("chess");
    }
}
