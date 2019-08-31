package com.pc.observer;

/**
 * 观察者接口
 */
public interface Observer {

    /**
     * 修改参数的方法
     * @param temp 温度
     * @param humi 湿度
     * @param pres 气压
     */
    void update(float temp,float humi,float pres);

    void cancelRegister();
}
