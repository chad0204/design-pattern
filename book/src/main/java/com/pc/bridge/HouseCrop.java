package com.pc.bridge;

/**
 *
 * @author pengchao
 * @since 2022/8/8 11:31
 */
public class HouseCrop extends AbstractCrop {

    public HouseCrop(Product product) {
        super(product);
    }

    @Override
    public void produce() {
        System.out.println("造房子");
    }

    @Override
    public void sell() {
        System.out.println("卖房子");
    }
}
