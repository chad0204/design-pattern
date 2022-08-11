package com.pc.mediator;

import lombok.Data;

/**
 * 销售
 *
 * @author pengchao
 * @since 2022/8/11 18:57
 */
@Data
public class Sale {

    private int saleStatus;//销售情况

    private Stock stock;
    private Purchase purchase;

    public Sale(Stock stock, Purchase purchase) {
        this.stock = stock;
        this.purchase = purchase;
    }

    public void sell(int num) {
        int capacity = stock.getCapacity();

        //库存不够，得让采购进货
        purchase.buy(num - capacity);

    }



    public void offSale() {
        //有多少卖多少
        int capacity = stock.getCapacity();
    }
}
