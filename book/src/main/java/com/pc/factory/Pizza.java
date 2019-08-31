package com.pc.factory;

import com.pc.factory.abstractFactory.ingredient.Chess;
import com.pc.factory.abstractFactory.ingredient.Dough;
import com.pc.factory.abstractFactory.ingredient.Sauce;
import com.pc.factory.abstractFactory.ingredient.Veggies;

public abstract class Pizza {

    String name;
    Dough dough;//面团
    Sauce sauce;//酱汁
    Veggies[] veggies;//蔬菜
    Chess chess;//芝士

    public abstract void prepare();//准备

    public void bake() {};//烘烤

    public void cut() {};//切块

    public void box() {};//装盒

}