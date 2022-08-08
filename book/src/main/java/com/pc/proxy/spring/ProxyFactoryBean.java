package com.pc.proxy.spring;

import com.pc.proxy.spring.aop.AopProxyFactory;
import com.pc.proxy.spring.aop.ProxyConfig;
import com.pc.proxy.spring.aop.proxy.AopProxy;

/**
 *
 * @author pengchao
 * @since 2022/8/5 14:07
 */
public class ProxyFactoryBean extends ProxyConfig implements FactoryBean<Object> {

    private AopProxyFactory aopProxyFactory;

    public ProxyFactoryBean(AopProxyFactory aopProxyFactory) {
        this.aopProxyFactory = aopProxyFactory;
    }

    @Override
    public Object getObject() {
        //TODO 初始化通知类，将通知的名称转为通知对象

        return this.getProxy(createAopProxy());
    }

    private AopProxy createAopProxy() {
        return this.aopProxyFactory.createAopProxy(this);
    }


    private Object getProxy(AopProxy aopProxy) {
        return aopProxy.getProxy(Thread.currentThread().getContextClassLoader());
    }
}
