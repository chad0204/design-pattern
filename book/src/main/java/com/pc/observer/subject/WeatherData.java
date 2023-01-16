package com.pc.observer.subject;

import com.pc.observer.Subject;

/**
 * 天气数据来源类
 */
public class WeatherData extends Subject {

    private float temp;//温度
    private float humi;//湿度
    private float pres;//气压

    public WeatherData() {
        super();
    }

    /**
     * 推的方式
     */
    public void notifyObservers() {
        //遍历所有注册过的观察者，推送过去
        observers.forEach(observer -> observer.update(temp,humi,pres));
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    //更新数据时通知所有观察者
    public void setMeasurements(float temp,float humi,float pres ) {
        this.temp = temp;
        this.humi = humi;
        this.pres = pres;
        measurementsChanged();
    }
}
