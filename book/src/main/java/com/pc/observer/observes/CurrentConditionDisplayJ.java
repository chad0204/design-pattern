package com.pc.observer.observes;

import com.pc.observer.DisplayElement;
import com.pc.observer.subject.WeatherDataJ;

import java.util.Observable;
import java.util.Observer;

/**
 * 目前状况显示板-使用Java自带的观察者
 */
public class CurrentConditionDisplayJ implements Observer, DisplayElement {

    private float temp;
    private float humi;

    private Observable weatherData;//保留引用可以方便后续的取消注册操作

    public CurrentConditionDisplayJ(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        //只显示温度和湿度
        System.out.println("CurrentConditionDisplayJ:temp- "+temp+",humi-"+humi);
    }


    /**
     * 主题通过注册过的观察者的update方法发送通知，Java api提供的update方法有两个参数，
     * 一个是主题对象，观察者可通过这个对象主动拉取数据，另一个是参数对象，是主题推送的数据。
     * @param o 主题对象
     * @param arg 推送参数
     */
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataJ) {
            WeatherDataJ weatherData = (WeatherDataJ) o;
            this.temp = weatherData.getTemp();//获得主题对象，从主题中拉取数据
            this.humi = weatherData.getHumi();//获得主题对象，从主题中拉取数据
            display();
        }
    }
}
