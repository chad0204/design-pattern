package com.pc.state.state;

import com.pc.state.GumballMachine;
import java.util.Random;

/**
 * @author dx
 * @className HasQuarterState
 * @description 投币状态
 * @date 2019-08-15 11:16
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned ...");
        //有可能中奖
        int winner = new Random().nextInt(10);
        if(winner==0 && gumballMachine.getCount()>1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
