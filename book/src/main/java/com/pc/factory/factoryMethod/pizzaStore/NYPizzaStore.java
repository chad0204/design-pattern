package com.pc.factory.factoryMethod.pizzaStore;

import com.pc.factory.Pizza;
import com.pc.factory.factoryMethod.pizza.NYStylePizza1;
import com.pc.factory.factoryMethod.pizza.NYStylePizza2;
import com.pc.factory.factoryMethod.pizza.NYStylePizza3;

/**
 * @author dx
 * @className NYPizzaStore
 * @description TODO
 * @date 2019-08-02 21:39
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if(type.equals("1")) {
            return new NYStylePizza1();
        } else if(type.equals("2")) {
            return new NYStylePizza2();
        } else if(type.equals("3")) {
            return new NYStylePizza3();
        } else {
            return new NYStylePizza1();
        }

    }
}

