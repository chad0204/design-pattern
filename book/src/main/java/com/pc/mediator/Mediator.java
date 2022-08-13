package com.pc.mediator;

/**
 *
 * @author pengchao
 * @date 11:08 2022/8/13
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String biz, Object... objects) {
        if(biz.equals("purchase.buy")) {
            this.buy((Integer)objects[0]);
        } else if (biz.equals("sale.sell")) {
            this.sell((Integer)objects[0]);
        }
    }

    //实现需要多个对象协作的方法

    //采购
    private void buy(Integer number) {
        if (super.sale.getSaleStatus() > 80) {
            super.stock.increment(number);
        } else {
            super.stock.increment(number / 2);
        }
    }

    //销售
    private void sell(int num) {
        int capacity = super.stock.getCapacity();
        //如果库存不够，得让采购进货
        super.purchase.buy(num - capacity);

    }

    //打折销售
    private void offSale() {
        int capacity = super.stock.getCapacity();
        //然后将全部打折卖出
        super.sale.sell(capacity);
    }

    //清仓
    private void clearStock() {
        super.purchase.stopBuy();
        super.sale.offSale();//this.offSale()

    }
}
