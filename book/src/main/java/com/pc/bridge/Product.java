package com.pc.bridge;

/**
 *
 * @author pengchao
 * @since 2022/8/8 11:43
 */
public interface Product {

    void beProduce();
    void beSell();
}

class IPhone implements Product {

    @Override
    public void beProduce() {
        System.out.println("手机被生产");
    }

    @Override
    public void beSell() {
        System.out.println("手机被卖了");
    }
}

class House implements Product {

    @Override
    public void beProduce() {
        System.out.println("房子被生产");
    }

    @Override
    public void beSell() {
        System.out.println("房子被卖了");
    }
}
