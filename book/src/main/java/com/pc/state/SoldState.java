package com.pc.state;

/**
 * @author dx
 * @className SoldState
 * @description TODO
 * @date 2019-08-15 11:16
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry,you already turned the crank");//已经转动手柄，不能退币
    }

    @Override
    public void turnCrank() {
        System.out.println("turned twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops,out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
