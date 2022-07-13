package com.pc.factory.abstractFactory.spring;

/**
 *
 * @author pengchao
 * @since 2022/7/13 14:15
 */
public class Test {

    public static void main(String[] args) {

        BeanFactory beanFactory = new AnnotationBeanFactory();
        beanFactory.getPrototypeBean();

    }
}
