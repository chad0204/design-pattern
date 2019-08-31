package com.pc.observer.observes;

import com.pc.observer.DisplayElement;
import com.pc.observer.Observer;
import com.pc.observer.Subject;

/**
 * 目前状况显示板，是一个观察者
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humi;

    private Subject weatherData;//保留引用可以方便后续的取消注册操作

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //初始化这个观察者，就被注册到主题上了
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        //只显示温度和湿度
        System.out.println("CurrentConditionDisplay:temp- "+temp+",humi-"+humi);
    }

    @Override
    public void update(float temp, float humi, float pres) {
        this.temp = temp;
        this.humi = humi;
        display();//这里是最适合调用display的地方
    }

    @Override
    public void cancelRegister() {
        weatherData.removeObserver(this);
    }
}
