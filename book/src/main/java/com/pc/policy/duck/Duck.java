package com.pc.policy.duck;

import com.pc.policy.duck.behavior.FlyBehavior;


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
