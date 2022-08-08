package com.pc.proxy;

import java.lang.reflect.Proxy;

/**
 * @author dx
 * @className Main
 * @description 一个打分程序，自己可以填写信息，别人可以打分，相当于权限控制。为对象生成一个代理对象，通过代理对象控制对象的操作权限。
 *
 *
 *
 *
 * 装饰者和代理的区别：
 *      装饰者模式和被装饰者实现相同的接口，装饰者持有被装饰者的引用，改造类的行为。
 *      而代理模式通过生成一个代理对象，来控制对实际对象的访问，并不需要相同类型，
 *      如动态代理和远程代理。装饰者可以看成是静态代理，主要还是意图不一样，一个针
 *      对行为，一个控制对象。
 *
 * @date 2019-08-16 13:51
 *
 *
 *
 */
public class Client {


    public static void main(String[] args) {

        Client main = new Client();

        main.driver();

    }


    private void driver() {


        PersonBean lufei = new PersonBeanImpl("路飞","男","聚会");


        //自己
        PersonBean ownerProxy = getOwnerProxy(lufei);


        ownerProxy.setInterests("修改自己的兴趣");
        System.out.println(lufei.getInterests());

        ownerProxy.doHotOrNotRating(9);//自己给自己打分是不允许的


        //别人
        PersonBean namei = new PersonBeanImpl("娜美","女","购物");


        PersonBean nonOwnerProxy = getNonOwnerProxy(namei);
        //其实可以直接传入属性，不用关心谁被代理了
        PersonBean nonOwnerProxyV2 = getNonOwnerProxy("娜美","女","购物");


        nonOwnerProxy.doHotOrNotRating(10);//给别人打分

        System.out.println(namei.getHotOrNotRating());

        nonOwnerProxy.setInterests("修改别人的兴趣");
    }



    PersonBean getOwnerProxy(PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(String name, String gender, String interests) {
        PersonBean person = new PersonBeanImpl("娜美","女","购物");
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
