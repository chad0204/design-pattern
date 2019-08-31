package com.pc.strategy;

import com.pc.strategy.duck.Duck;
import com.pc.strategy.duck.ModelDuck;
import com.pc.strategy.duck.behavior.FlyBehaviorModelFly;
import com.pc.strategy.duck.behavior.FlyBehaviorNoFly;

/**
 * 使用继承，不能解决有些子类不需要某方法的问题，比如橡皮鸭不会飞。
 * 使用接口，不能解决代码复用的问题，每个实现类都要实现一遍。
 */
public class Test {

    public static void main(String[] args) {

        Duck duck = new ModelDuck();
        duck.setFlyBehavior(new FlyBehaviorModelFly());
//        duck.setFlyBehavior(new FlyBehaviorNoFly());
        duck.fly();


        System.out.println();

    }


}
