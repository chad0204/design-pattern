package com.pc.strategy.duck;

import com.pc.strategy.duck.behavior.FlyBehavior;


public abstract class Duck {

    public String name = "duck";


    FlyBehavior flyBehavior;

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        System.out.println("gagaga");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
