package com.pc.factory.simpleFactory;

import com.pc.factory.Pizza;

/**
 * @author dx
 * @className PizzaFactory
 * @description 简单工厂
 * @date 2019-08-02 16:33
 */
public class SimplePizzaFactory {

     public Pizza createPizza(String type) {
        Pizza pizza=null;

        if("veggie".equals(type)) {
            pizza = new VeggiePizza();
        } else if("chess".equals(type)) {
            pizza = new ChessPizza();
        }
         return pizza;
     }
}

class VeggiePizza extends Pizza {

    @Override
    public void prepare() {

    }

}

class ChessPizza extends Pizza {

    @Override
    public void prepare() {

    }


}
