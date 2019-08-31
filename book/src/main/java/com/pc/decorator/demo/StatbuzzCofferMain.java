package com.pc.decorator.demo;

/**
 * @author dx
 * @className StatbuzzCofferMain
 * @description 完成一杯咖啡
 * @date 2019-07-27 14:59
 *
 *             饮料                   调料                杯型
 *          Beverage            CondimentDecorator   SizeDecorator
 *
 *      Espresso,HouseBlend     Mocha,Soy,Whip         Tall,Grande,Venti
 *
 */
public class StatbuzzCofferMain {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();//定一杯蒸馏咖啡，不需要调料
        System.out.println(beverage.getDescription()+" $"+beverage.cost());



        Beverage beverage1 = new HouseBlend();//订一杯混合咖啡，加双倍摩卡，再加奶泡
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());


        Beverage beverage2 = new HouseBlend();//订一杯混合咖啡，加双倍摩卡，再加奶泡,小杯
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Tall(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());

    }
}
