package com.pc.bridge;

/**
 *
 * @author pengchao
 * @since 2022/8/8 11:28
 */
public abstract class AbstractCrop implements Crop {

    private Product product;

    public AbstractCrop(Product product) {
        this.product = product;
    }

    protected void makeMoney() {
        this.product.beProduce();
        this.product.beSell();
    }
}
