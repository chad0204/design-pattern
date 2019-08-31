package com.pc.iterator.iterator;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;
/**
 * @author dx
 * @className PancakeHouseMenu
 * @description 煎饼屋菜单
 * @date 2019-08-13 19:47
 */
public class PancakeHouseMenu implements Menu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("粥","南瓜粥",true,2.99);
        addItem("饼","煎饼果子",true,5.99);
        addItem("汉堡","牛肉汉堡",false,7.99);
    }

    private void addItem(String name, String description, boolean veg, double price) {
        MenuItem menuItem = new MenuItem(name,description,veg,price);
        menuItems.add(menuItem);
    }

//    public List<MenuItem> getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator<MenuItem> createIterator() {
//        return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }

    //do something else
}
