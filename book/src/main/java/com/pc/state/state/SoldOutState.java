package com.pc.state.state;

import com.pc.state.GumballMachine;

/**
 * @author dx
 * @className SoldOutState
 * @description 售罄状态
 * @date 2019-08-15 11:15
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't eject, you haven't insert a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned but there's no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
