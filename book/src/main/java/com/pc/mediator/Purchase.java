package com.pc.mediator;

/**
 * 采购
 *
 * @author pengchao
 * @since 2022/8/11 18:57
 */
public class Purchase {
    private Sale sale;
    private Stock stock;

    public Purchase(Sale sale, Stock stock) {
        this.sale = sale;
        this.stock = stock;
    }

    public void buy(int num) {
        if (sale.getSaleStatus() > 80) {
            stock.increment(num);
        } else {
            stock.increment(num / 2);
        }
    }

    public void stopBuy() {
        System.out.println("停止采购");
    }
}
