package com.pc.iterator.component;

import java.util.Iterator;

/**
 * @author dx
 * @className Waitress
 * @description TODO
 * @date 2019-08-14 17:15
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }


    //取出所有的素菜
    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("**********素菜单**********");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();

            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (Exception e) {
                //如果menuComponent是Menu,没有isVegetarian()方法，抛异处理
                e.printStackTrace();
            }
        }
    }


}
