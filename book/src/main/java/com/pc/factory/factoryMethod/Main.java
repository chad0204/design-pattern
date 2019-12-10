package com.pc.factory.factoryMethod;


import com.pc.factory.factoryMethod.pizzaStore.NYPizzaStore;
import com.pc.factory.factoryMethod.pizzaStore.PizzaStore;
import com.pc.factory.Pizza;

/**
 * @author dx
 * @className Main
 * @description 工厂方法模式
 *
 *      提供一个抽象方法，由子类实现，取代简单工厂模式中的工厂类
 *
 * @date 2019-08-02 22:24
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();//选什么商店，就得到什么披萨
        Pizza pizza = pizzaStore.orderPizza("chess");
    }
}
