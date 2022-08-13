package com.pc.mediator;

import lombok.Data;

/**
 * 采购
 *
 * @author pengchao
 * @since 2022/8/11 18:57
 */
@Data
public class Purchase extends Colleague {
//    private Sale sale;
//    private Stock stock;

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buy(int num) {

    }

    public void stopBuy() {
        System.out.println("停止采购");
    }
}
