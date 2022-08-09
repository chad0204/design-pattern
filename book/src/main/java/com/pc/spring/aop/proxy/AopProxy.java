package com.pc.spring.aop.proxy;

/**
 *
 *
 * @author pengchao
 * @since 2022/8/5 14:07
 */
public interface AopProxy {

    Object getProxy();

    Object getProxy(ClassLoader classLoader);

}
