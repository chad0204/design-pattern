package com.pc.adapter.duckExample;

/**
 * @author dx
 * @className TurkeyAdapter
 * @description 火鸡适配器
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
