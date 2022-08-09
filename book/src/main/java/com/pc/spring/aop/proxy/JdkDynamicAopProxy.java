package com.pc.spring.aop.proxy;

import com.pc.spring.aop.ProxyConfig;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author pengchao
 * @since 2022/8/5 14:09
 */
public class JdkDynamicAopProxy implements AopProxy, InvocationHandler {

    private ProxyConfig proxyConfig;

    public JdkDynamicAopProxy(ProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
    }

    @Override
    public Object getProxy() {
        return this.getProxy(Thread.currentThread().getContextClassLoader());
    }

    @Override
    public Object getProxy(ClassLoader classLoader) {
        return Proxy.newProxyInstance(classLoader,
                proxyConfig.getProxyInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //TODO 执行通知拦截器链, 这里有个责任链模式

        return method.invoke(proxyConfig.getTarget(), args);
    }
}
