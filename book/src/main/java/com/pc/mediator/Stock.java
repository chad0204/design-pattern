package com.pc.mediator;

/**
 * 库存
 *
 * @author pengchao
 * @since 2022/8/11 18:57
 */
public class Stock {
    //库存
    private int capacity = 100;
    private Sale sale;
    private Purchase purchase;

    public Stock(Sale sale, Purchase purchase) {
        this.sale = sale;
        this.purchase = purchase;
    }

    public void increment(int num) {
        this.capacity += num;
        System.out.printf("入库%s, 当前库存%s%n", num, capacity);
    }

    public void decrement(int num) {
        this.capacity -= num;
        System.out.printf("出库%s, 当前库存%s%n", num, capacity);
    }

    public void clearStock() {
        purchase.stopBuy();
        sale.offSale();
    }

    public int getCapacity() {
        return capacity;
    }
}
