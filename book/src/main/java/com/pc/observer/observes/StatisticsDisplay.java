package com.pc.observer.observes;

import com.pc.observer.DisplayElement;
import com.pc.observer.Observer;

/**
 * 天气统计显示板
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humi, float pres) {

    }

    @Override
    public void cancelRegister() {

    }
}
