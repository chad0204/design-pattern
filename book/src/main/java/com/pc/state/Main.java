package com.pc.state;

/**
 * @author dx
 * @className Main
 * @description 老扭蛋机和新扭蛋机
 * @date 2019-08-15 13:57
 */
public class Main {

    public static void main(String[] args) {

        OldGumballMachine oldGumballMachine = new OldGumballMachine(2);//初始化两件物品
        oldGumballMachine.insertQuarter();
        oldGumballMachine.turnCrank();


        System.out.println("===========================================");

        GumballMachine gumballMachine = new GumballMachine(2);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }
}
