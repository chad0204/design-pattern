package com.pc.factory.abstractFactory.ingredientFactory;

import com.pc.factory.abstractFactory.ingredient.Chess;
import com.pc.factory.abstractFactory.ingredient.Dough;
import com.pc.factory.abstractFactory.ingredient.Sauce;
import com.pc.factory.abstractFactory.ingredient.Veggies;

/**
 * @author dx
 * @className NYPizzaIngredientFactory
 * @description 纽约风格的调料工厂
 * @date 2019-08-03 14:40
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Chess createChess() {
        return null;
    }
}
