package com.pc.spring.aop;

import com.pc.spring.aop.proxy.AopProxy;
import com.pc.spring.aop.proxy.CglibDynamicAopProxy;
import com.pc.spring.aop.proxy.JavassistDynamicAopProxy;
import com.pc.spring.aop.proxy.JdkDynamicAopProxy;

/**
 *
 * @author pengchao
 * @since 2022/8/5 14:25
 */
public class DefaultAopProxyFactory implements AopProxyFactory {
    @Override
    public AopProxy createAopProxy(ProxyConfig config) {
        switch (config.getProxyType()) {
            case JDK:
                new JdkDynamicAopProxy(config);
            case CGLIB:
                new CglibDynamicAopProxy(config);
            case JAVASSIST:
                new JavassistDynamicAopProxy(config);
        }
        return null;
    }
}
