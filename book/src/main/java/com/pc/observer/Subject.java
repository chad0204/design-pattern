package com.pc.observer;

import java.util.ArrayList;

/**
 * 主题接口
 */
public abstract class Subject {

    //观察者容器
    protected ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
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

    public abstract void notifyObservers();
}
