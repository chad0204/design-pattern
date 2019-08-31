package com.pc.factory.factoryMethod.pizzaStore;

import com.pc.factory.Pizza;
import com.pc.factory.factoryMethod.pizza.ChicagoStylePizza1;
import com.pc.factory.factoryMethod.pizza.ChicagoStylePizza2;
import com.pc.factory.factoryMethod.pizza.ChicagoStylePizza3;

/**
 * @author dx
 * @className ChicagoPizzaStore
 * @description TODO
 * @date 2019-08-02 21:40
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if(type.equals("1")) {
            return new ChicagoStylePizza1();
        } else if(type.equals("2")) {
            return new ChicagoStylePizza2();
        } else if(type.equals("3")) {
            return new ChicagoStylePizza3();
        } else {
            return new ChicagoStylePizza1();
        }

    }
}

