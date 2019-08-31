package com.pc.strategy.duck.behavior;

public class FlyBehaviorNoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I cant fly");
    }
}
