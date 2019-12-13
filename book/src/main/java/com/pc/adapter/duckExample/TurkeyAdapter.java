package com.pc.adapter.duckExample;

/**
 * @author dx
 * @className TurkeyAdapter
 * @description 火鸡适配器
 *
 *      火鸡并没有鸭子的方法，但通过火鸡适配器，火鸡看起来就像一只鸭子
 * @date 2019-08-13 14:20
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void gaga() {
        turkey.gege();
    }

    @Override
    public void fly() {
        for(int i=0; i<5; i++) {
            turkey.fly();//火鸡飞五次相当于鸭子飞一次
        }
    }
}
