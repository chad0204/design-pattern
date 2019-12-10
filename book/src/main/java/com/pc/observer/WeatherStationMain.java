package com.pc.observer;


import com.pc.observer.observes.CurrentConditionDisplay;
import com.pc.observer.observes.CurrentConditionDisplayJ;
import com.pc.observer.subject.WeatherData;
import com.pc.observer.subject.WeatherDataJ;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;

/**
 * 推是直接传数据，拉是传主题引用
 */
@Slf4j
public class WeatherStationMain {

    public static void main(String[] args) {

        /**
         * 这是一种推的方式
         *  就是主题类维护了一组观察者对象引用，观察者初始化后注册到主题中，主题修改会遍历观察者并发送给修改数据。
         *
         */
        //主题
        WeatherData weatherData = new WeatherData();
        //观察者
        Observer currentConditionDisplay1 = new CurrentConditionDisplay(weatherData,"山后");//注册

        Observer currentConditionDisplay2 = new CurrentConditionDisplay(weatherData,"河边");//注册



        //主题数据一更新，观察者也会更新显示板
        weatherData.setMeasurements(1,2,3);//推
        weatherData.setMeasurements(4,5,6);
        weatherData.setMeasurements(7,8,9);

        weatherData.removeObserver(currentConditionDisplay1);//被移除的观察者收不到推送

        weatherData.setMeasurements(10,11,12);

        System.out.println("================================");

        /**
         * 这是一种拉的方式，java自带的主题（可观察者）和观察者
         *     观察者注册到主题中，主题修改时将自身引用传给观察者，观察者通过主题引用自己拉取修改后的内容
         */

        //可观察者（也就是主题）
        WeatherDataJ weatherDataj = new WeatherDataJ();
        //观察者
        CurrentConditionDisplayJ display = new CurrentConditionDisplayJ(weatherDataj);

        weatherDataj.setMeasurements(1,2,3);//拉
        weatherDataj.setMeasurements(4,5,6);
        weatherDataj.setMeasurements(7,8,9);


        weatherDataj.deleteObserver(display);//移除观察者

        weatherDataj.setMeasurements(10,11,12);//收不到


    }
}
