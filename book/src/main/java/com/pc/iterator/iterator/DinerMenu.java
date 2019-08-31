package com.pc.iterator.iterator;

import java.util.Iterator;
/**
 * @author dx
 * @className DinerMenu
 * @description 餐厅晚饭菜单
 * @date 2019-08-13 19:56
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("黄焖鸡","黄焖鸡",true,2.99);
        addItem("龙虾","龙虾",true,5.99);
        addItem("火锅","火锅",false,7.99);
    }

    private void addItem(String name, String description, boolean veg, double price) {
        MenuItem menuItem = new MenuItem(name,description,veg,price);
        if(numberOfItems>=MAX_ITEMS) {
            System.out.println("sorry,menu is full!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }


    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }





    //do something else

}
