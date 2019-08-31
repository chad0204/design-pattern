package com.pc.state;

/**
 * @author dx
 * @className WinnerState
 * @description TODO
 * @date 2019-08-15 14:24
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("不可执行");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("不可执行");
    }

    @Override
    public void turnCrank() {
        System.out.println("不可执行");
    }

    @Override
    public void dispense() {
        System.out.println("you are a winner! you get two gumballs for your quarter");
        gumballMachine.releaseBall();//放一个
        if(gumballMachine.getCount()==0) {
            //不够爆炸，发一个好了
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();//奖励一个
            if(gumballMachine.getCount()>0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops,out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
