package com.pc.iterator.component;

import java.util.Iterator;

/**
 * @author dx
 * @className MenuComponent
 * @description TODO
 * @date 2019-08-14 17:00
 */
public abstract class MenuComponent {

    /*-------------------组合使用的方法---------------------*/

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /*--------------------元素使用的方法--------------------*/

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    /*------------------这是组合和元素共有的方法---------------*/

    public void print() {
        throw new UnsupportedOperationException();
    }

    abstract Iterator createIterator();
}
