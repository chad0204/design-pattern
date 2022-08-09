package com.pc.spring.aop;

import com.pc.spring.aop.proxy.AopProxy;

/**
 *
 * @author pengchao
 * @since 2022/8/5 14:15
 */
public interface AopProxyFactory {

    /**
     * 策略模式
     * @param var1
     * @return
     */
    AopProxy createAopProxy(ProxyConfig var1);

}
