package com.pc.factory.factoryMethod.pizzaStore;

import com.pc.factory.factoryMethod.pizza.*;
import com.pc.factory.Pizza;

/**
 * @author dx
 * @className DependentPizzaStore
 * @description 这是一个没有用工厂的反例，看吧，他依赖的多少个导入的类，修改起来更加麻烦
 * @date 2019-08-03 10:24
 */
public class DependentPizzaStore {


    //anyOperation
    public final Pizza orderPizza(String style,String type) {
        //Pizza的种类由具体的商店提供
        Pizza pizza = null;
        if(style.equals("Chicago")) {
            if(type.equals("1")) {
                pizza = new ChicagoStylePizza1();
            } else if(type.equals("2")) {
                pizza = new ChicagoStylePizza2();
            } else if(type.equals("3")) {
                return new ChicagoStylePizza3();
            } else {
                pizza = new ChicagoStylePizza1();
            }
        } else if(style.equals("NY")) {
            if(type.equals("1")) {
                pizza = new NYStylePizza1();
            } else if(type.equals("2")) {
                pizza = new NYStylePizza2();
            } else if(type.equals("3")) {
                pizza = new NYStylePizza3();
            } else {
                pizza = new NYStylePizza1();
            }
        } else {
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
