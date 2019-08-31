package com.pc.iterator.iterator;

import java.util.Iterator;
/**
 * @author dx
 * @className Waitress
 * @description TODO
 * @date 2019-08-13 20:24
 */
public class Waitress {
    //可以把Menu放在list中
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    CafeMenu cafeMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu,CafeMenu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        System.out.println("====MENU===BREAKFAST===============");
        printMenu(pancakeIterator);
        System.out.println("====MENU===LUNCH===============");
        printMenu(dinerIterator);
        System.out.println("====MENU===CAFE===============");
        printMenu(cafeIterator);

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            menuItem.print();
        }
    }

}
