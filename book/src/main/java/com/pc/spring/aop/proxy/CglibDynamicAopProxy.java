package com.pc.spring.aop.proxy;

import com.pc.spring.aop.ProxyConfig;


/**
 *
 * @author pengchao
 * @since 2022/8/5 14:10
 */
public class CglibDynamicAopProxy implements AopProxy {

    private ProxyConfig proxyConfig;

    public CglibDynamicAopProxy(ProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
    }

    @Override
    public Object getProxy() {
        return null;
    }

    @Override
    public Object getProxy(ClassLoader classLoader) {
        return null;
    }
}
