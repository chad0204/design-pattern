package com.pc.iterator.component;

/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-08-14 17:17
 */
public class Main {

    public static void main(String[] args) {

        MenuComponent pancakeMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","Dinner");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Cafe");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert");

        MenuComponent allMenus = new Menu("All MENU","All menu combined");
        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
//        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem("黄焖鸡","黄焖鸡",false,2.99));
        dinerMenu.add(new MenuItem("龙虾","龙虾",false,5.99));
        dinerMenu.add(new MenuItem("面条","面条",true,7.99));
        dinerMenu.add(dessertMenu);//放入一个甜点子菜单

        dessertMenu.add(new MenuItem("果盘","水果",true,1));
        dessertMenu.add(new MenuItem("蛋糕","甜品",true,1));


        //pancakeMenu和cafeMenu加入菜单项


        //服务员
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();


        waitress.printVegetarianMenu();


    }
}
