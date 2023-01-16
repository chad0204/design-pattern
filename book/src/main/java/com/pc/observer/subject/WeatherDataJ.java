package com.pc.observer.subject;

import java.util.Observable;

/**
 * 使用Java自带的主题-可观察者（抱歉，它不叫subject）
 */
public class WeatherDataJ extends Observable {

    private float temp;
    private float humi;
    private float pres;


    public void measurementsChanged() {
        //设置可用
        setChanged();
        //遍历观察者，调用观察者update.
        notifyObservers();//只推送主题对象，供观察者拉取。
//        notifyObservers(this);//推送主题对象，同时推送数据（这里的数据被封装在主题中，其实一样）
    }

    public void setMeasurements(float temp,float humi,float pres ) {
        this.temp = temp;
        this.humi = humi;
        this.pres = pres;
        measurementsChanged();
    }


    /**
     *
     * get为拉取数据的方式
     */
    public float getTemp() {
        return temp;
    }

    public float getHumi() {
        return humi;
    }

    public float getPres() {
        return pres;
    }
}
