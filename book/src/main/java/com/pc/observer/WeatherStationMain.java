package com.pc.observer;


import com.pc.observer.observes.CurrentConditionDisplay;
import com.pc.observer.observes.CurrentConditionDisplayJ;
import com.pc.observer.subject.WeatherData;
import com.pc.observer.subject.WeatherDataJ;


/**
 * 这是一种推的方式
 */
public class WeatherStationMain {

    public static void main(String[] args) {
        //主题
        WeatherData weatherData = new WeatherData();
        //观察者
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);//注册

        //主题数据一更新，观察者也会更新显示板
        weatherData.setMeasurements(1,2,3);//推
        weatherData.setMeasurements(4,5,6);
        weatherData.setMeasurements(7,8,9);

        weatherData.removeObserver(currentConditionDisplay);

        weatherData.setMeasurements(10,11,12);


        System.out.println("================================");

        //可观察者（也就是主题）
        WeatherDataJ weatherDataj = new WeatherDataJ();
        //观察者
        CurrentConditionDisplayJ display = new CurrentConditionDisplayJ(weatherDataj);

        weatherDataj.setMeasurements(1,2,3);//拉
        weatherDataj.setMeasurements(4,5,6);
        weatherDataj.setMeasurements(7,8,9);


        weatherDataj.deleteObserver(display);//移除观察者



    }
}
