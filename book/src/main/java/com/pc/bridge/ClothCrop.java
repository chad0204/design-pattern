package com.pc.bridge;

/**
 * @author pengchao
 * @since 2022/8/8 11:31
 */
public class ClothCrop extends AbstractCrop{

    public ClothCrop(Product product) {
        super(product);
    }

    @Override
    public void produce() {
        System.out.println("造衣服");
    }

    @Override
    public void sell() {
        System.out.println("卖衣服");
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("卖衣服赚小钱");
    }
}
