package com.pc.bridge;

/**
 * 桥接模式
 *
 * @author pengchao
 * @since 2022/8/8 11:27
 */
public class Client {

    public static void main(String[] args) {
        //总不能加一种产品就换一家公司吧！
        //而且也不好修改老的公司吧！
        AbstractCrop crop = new ClothCrop(new IPhone());
        crop.makeMoney();
    }
}
