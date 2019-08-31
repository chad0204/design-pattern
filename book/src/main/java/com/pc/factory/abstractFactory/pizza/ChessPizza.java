package com.pc.factory.abstractFactory.pizza;

import com.pc.factory.Pizza;
import com.pc.factory.abstractFactory.ingredientFactory.PizzaIngredientFactory;

public class ChessPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ChessPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        ingredientFactory.createChess();
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
    }


}
