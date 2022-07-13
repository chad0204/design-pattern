package com.pc.factory.abstractFactory.spring;

/**
 *
 * spring中类似的实现包括
 *  ClassPathXmlApplicationContext、XmlWebApplicationContext、StaticWebApplicationContext、StaticApplicationContext
 *
 * @author pengchao
 * @since 2022/7/13 14:15
 */
public interface BeanFactory {
    /**
     * 创建单例的bean
     * @return
     */
    Object getSingletonBean();

    /**
     * 创建原型的bean
     * @return
     */
    Object getPrototypeBean();
}
