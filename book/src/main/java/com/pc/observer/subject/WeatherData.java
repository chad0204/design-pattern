package com.pc.observer.subject;

import com.pc.observer.Observer;
import com.pc.observer.Subject;

import java.util.ArrayList;

/**
 * 天气数据来源类
 */
public class WeatherData implements Subject {

    private float temp;
    private float humi;
    private float pres;

    //观察者容器
    private ArrayList observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }


    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i;
        if(( i= observers.indexOf(o))>=0) {
            observers.remove(i);
        }
    }

    /**
     * 推的方式
     */
    public void notifyObservers() {
        observers.forEach(observer -> ((Observer)observer).update(temp,humi,pres));
    }

    public void measurementsChanged() {
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
