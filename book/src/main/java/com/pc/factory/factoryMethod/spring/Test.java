package com.pc.factory.factoryMethod.spring;

/**
 *
 * @author pengchao
 * @since 2022/7/13 15:01
 */
public class Test {
    public static void main(String[] args) {

        FactoryBean factoryBean = new ListFactoryBean();

        doCreate(factoryBean);
    }

    /**
     * 方法参数体现了依赖倒置
     * @param factoryBean 接口
     */
    public static void doCreate(FactoryBean factoryBean) {
        factoryBean.getObject();
    }
}
