package com.pc.proxy.spring.aop;

import java.lang.annotation.Target;

/**
 * 代理配置
 *
 * 根据配置来决定使用什么代理生成策略, 以及传递一些上下文信息, 这里简化成类型指定
 *
 * 封装主题对象的接口
 * 是否指定代理方式
 * ...
 *
 * @author pengchao
 * @since 2022/8/5 14:19
 */
public class ProxyConfig {

    private ProxyType proxyType;

    private Class<?>[] proxyInterfaces;

    private Object target;

    //advisor
    private String[] interceptorNames;


    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public ProxyType getProxyType() {
        return proxyType;
    }

    public void setProxyType(ProxyType proxyType) {
        this.proxyType = proxyType;
    }

    public Class<?>[] getProxyInterfaces() {
        return proxyInterfaces;
    }

    public void setProxyInterfaces(Class<?>[] proxyInterfaces) {
        this.proxyInterfaces = proxyInterfaces;
    }

    public String[] getInterceptorNames() {
        return interceptorNames;
    }

    public void setInterceptorNames(String[] interceptorNames) {
        this.interceptorNames = interceptorNames;
    }

    public enum ProxyType {
        JDK,
        CGLIB,
        JAVASSIST
    }
}
