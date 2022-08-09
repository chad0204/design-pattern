package com.pc.spring;

/**
 *
 * @author pengchao
 * @since 2022/8/5 14:11
 */
public interface FactoryBean<T> {

    T getObject();

}
