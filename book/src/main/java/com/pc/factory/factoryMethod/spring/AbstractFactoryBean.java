package com.pc.factory.factoryMethod.spring;

/**
 * 抽象工厂
 *
 * @author pengchao
 * @since 2022/7/13 15:05
 */
public abstract class AbstractFactoryBean<T> implements FactoryBean<T> {

    @Override
    public T getObject() {
        return createInstance();
    }

    /**
     * 这不是关键！
     * @return
     */
    protected abstract T createInstance();

}
