package com.pc.state.state;

public interface State {

    void insertQuarter();//插入硬币
    void ejectQuarter();//弹出硬币
    void turnCrank();//扭转曲柄
    void dispense();//得到

}
