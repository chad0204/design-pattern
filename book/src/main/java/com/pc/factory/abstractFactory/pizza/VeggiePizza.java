package com.pc.factory.abstractFactory.pizza;

import com.pc.factory.Pizza;
import com.pc.factory.abstractFactory.ingredientFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        ingredientFactory.createSauce();
        ingredientFactory.createDough();
        ingredientFactory.createVeggies();
    }

}

