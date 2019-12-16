package com.pc.state;

import com.pc.state.state.*;

/**
 * @author dx
 * @className GumballMachine
 * @description 扭蛋器
 * @date 2019-08-15 11:11
 */
public class GumballMachine {

    private State soldOutState;//售空
    private State noQuarterState;//未投币
    private State hasQuarterState;//有币
    private State soldState;//出货
    private State winnerState;//赢家



    private int count;
    private State state = new SoldOutState(this);


    public GumballMachine(int count) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.count = count;
        if(count>0) {
            state = noQuarterState;
        }
    }


    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("a gumball comes rolling out the slot...");
        if(count != 0) {
            count--;
        }
    }


    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }
}
