package com.pc.state;

/**
 * @author dx
 * @className OldGumballMachine
 * @description 问题在于，如果现在想多加一个状态，那么需要改动的旧代码就太多了，涉及每一步操作
 * @date 2019-08-15 10:38
 */
public class OldGumballMachine {

    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 2;
    private final static int SOLD = 3;

    int state = SOLD_OUT;//默认状态为售磬
    private int count;//数量

    public OldGumballMachine(int count) {
        this.count = count;
        if(count>0) {
            this.state = NO_QUARTER;
        }
    }


    public void insertQuarter() {
        if(state == HAS_QUARTER) {
            System.out.println("you can't insert another quarter");
        } else if(state == NO_QUARTER) {//未投币状态才可以投币
            state = HAS_QUARTER;
            System.out.println("you insert a quarter succeed");
        } else if(state == SOLD_OUT) {
            System.out.println("you can't insert a quarter,the machine is sold out");
        } else if(state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }


    public void ejectQuarter() {
        if(state == HAS_QUARTER) {//已投币状态才可以退币
            state = NO_QUARTER;
            System.out.println("quarter returned");
        } else if(state == NO_QUARTER) {
            System.out.println("you haven't insert a quarter");
        } else if(state == SOLD_OUT) {
            System.out.println("you can't eject, you haven't insert a quarter yet");
        } else if(state == SOLD) {
            System.out.println("sorry,you already turned the crank");//已经转动手柄，不能退币
        }
    }

    public void turnCrank() {
        if(state == HAS_QUARTER) {//已投币状态才可以转动手柄
            state = SOLD;
            System.out.println("you turned ...");
            dispense();
        } else if(state == NO_QUARTER) {
            System.out.println("you turned but there's no quarter");
        } else if(state == SOLD_OUT) {
            System.out.println("you turned but there's no gumballs");
        } else if(state == SOLD) {
            System.out.println("turned twice doesn't get you another gumball");
        }
    }

    private void dispense() {//发放糖果
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            if(count-- == 0) {
                System.out.println("Oops,out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if(state == NO_QUARTER) {
            System.out.println("you need to pay first");
        } else if(state == SOLD_OUT) {
            System.out.println("no gumball dispensed");
        } else if(state == HAS_QUARTER) {
            System.out.println("no gumball dispensed");
        }
    }


    //something else

}
