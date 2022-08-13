package com.pc.mediator;

/**
 * 进销存管理系统
 *
 *
 *
 *
 * @author pengchao
 * @since 2022/8/11 18:56
 */
public class Client {

    public static void main(String[] args) {

//        Purchase purchase = new Purchase();
//        Sale sale = new Sale();
//        Stock stock = new Stock();
//        //非常耦合
//        purchase.setSale(sale);
//        purchase.setStock(stock);
//
//        sale.setStock(stock);
//        sale.setPurchase(purchase);
//
//        sale.setPurchase(purchase);
//        sale.setStock(stock);


        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        Sale sale = new Sale(mediator);
        Stock stock = new Stock(mediator);
        mediator.execute("purchase.buy");


    }
}
