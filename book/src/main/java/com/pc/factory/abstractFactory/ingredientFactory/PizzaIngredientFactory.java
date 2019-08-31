package com.pc.factory.abstractFactory.ingredientFactory;

import com.pc.factory.abstractFactory.ingredient.Chess;
import com.pc.factory.abstractFactory.ingredient.Dough;
import com.pc.factory.abstractFactory.ingredient.Sauce;
import com.pc.factory.abstractFactory.ingredient.Veggies;

/**
 * 披萨原料工厂
 */
public interface PizzaIngredientFactory {

    //一组工厂方法
    Dough createDough();
    Sauce createSauce();
    Veggies[] createVeggies();
    Chess createChess();
}
