package com.pc.policy.duck.behavior;

public class FlyBehaviorNoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
