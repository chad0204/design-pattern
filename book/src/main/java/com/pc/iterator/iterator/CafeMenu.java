package com.pc.iterator.iterator;

import java.util.*;
import java.util.Iterator;

/**
 * @author dx
 * @className CafeMenu
 * @description 咖啡菜单-map
 * @date 2019-08-14 14:19
 */
public class CafeMenu implements Menu {

    Map<String,MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new HashMap<>();
        addItem("拿铁","拿铁",false,10.99);
        addItem("摩卡","摩卡",false,10.99);
        addItem("卡布奇诺","卡布奇诺",false,9.99);
    }

    private void addItem(String name, String description, boolean veg, double price) {
        MenuItem menuItem = new MenuItem(name,description,veg,price);
        menuItems.put(name,menuItem);
    }

//    public List<MenuItem> getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator<MenuItem> createIterator() {
//        return new PancakeHouseMenuIterator(menuItems);
        return menuItems.values().iterator();
    }

    //do something else
}
