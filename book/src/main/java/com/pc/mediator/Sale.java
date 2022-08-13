package com.pc.mediator;

import lombok.Data;

/**
 * 销售
 *
 * @author pengchao
 * @since 2022/8/11 18:57
 */
@Data
public class Sale extends Colleague {

    private int saleStatus;//销售情况

//    private Stock stock;
//    private Purchase purchase;

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }


    public void sell(int num) {
        super.mediator.execute("sale.sell");
    }


    public void offSale() {
        //有多少卖多少
        super.mediator.execute("stock.offSale");

    }
}
