package com.pc.factory.factoryMethod.spring;

/**
 * bean实例化
 *
 * @author pengchao
 * @since 2022/7/13 15:02
 */
public interface FactoryBean<T> {
    /**
     * 工厂方法
     * @return
     */
    T getObject();
}