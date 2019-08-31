package com.pc.factory.abstractFactory.pizzaStore;

import com.pc.factory.Pizza;
import com.pc.factory.abstractFactory.ingredientFactory.NYPizzaIngredientFactory;
import com.pc.factory.abstractFactory.ingredientFactory.PizzaIngredientFactory;
import com.pc.factory.abstractFactory.pizza.ChessPizza;
import com.pc.factory.abstractFactory.pizza.VeggiePizza;
import com.pc.factory.factoryMethod.pizzaStore.PizzaStore;

/**
 * @author dx
 * @className NYPizzaStore
 * @description TODO
 * @date 2019-08-02 21:39
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("chess")) {
            return new ChessPizza(ingredientFactory);
        } else if(type.equals("veggies")) {
            return new VeggiePizza(ingredientFactory);
        }

        return null;

    }
}

