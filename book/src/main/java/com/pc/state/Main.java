package com.pc.state;

/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-08-15 13:57
 */
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);



        gumballMachine.insertQuarter();


        gumballMachine.turnCrank();

    }
}
