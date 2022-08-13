package com.pc.mediator;

import lombok.Data;

/**
 * 库存
 *
 * @author pengchao
 * @since 2022/8/11 18:57
 */
@Data
public class Stock extends Colleague {
    //库存
    private int capacity = 100;
//    private Sale sale;
//    private Purchase purchase;

    public Stock(AbstractMediator mediator) {
        super(mediator);
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
        super.mediator.execute("stock.clearStock");
    }
}
