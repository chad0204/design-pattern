package com.pc.factory.abstractFactory.spring;

/**
 * TODO
 *
 * @author pengchao
 * @since 2022/7/13 15:31
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    @Override
    public Object getSingletonBean() {
        //单例处理逻辑
        return getObject();
    }

    @Override
    public Object getPrototypeBean() {
        //原型处理逻辑
        return getObject();
    }

    /**
     * 具体的初始化逻辑由不同的工厂子类实现
     * @return
     */
    protected abstract Object getObject();

}
