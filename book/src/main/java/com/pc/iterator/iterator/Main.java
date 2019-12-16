package com.pc.iterator.iterator;

import java.util.HashMap;

/**
 * @author dx
 * @className Main
 * @description
 * @date 2019-08-13 20:29
 */
public class Main {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);

        waitress.printMenu();




    }
}
