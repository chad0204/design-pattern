package com.pc.adapter.duckExample;

/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-08-13 14:22
 */
public class Main {

    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter(new WildTurkey());

        testDuck(duck);//testDuck 并不知道自己调用的其实是个看起来像鸭子的火鸡
    }


    static void testDuck(Duck duck) {
        duck.fly();
        duck.gaga();
    }

}
