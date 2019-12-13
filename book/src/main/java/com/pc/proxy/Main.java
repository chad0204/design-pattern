package com.pc.proxy;

import java.lang.reflect.Proxy;

/**
 * @author dx
 * @className Main
 * @description 一个打分程序，自己可以填写信息，别人可以打分，相当于权限控制。为对象生成一个代理对象，通过代理对象控制对象的操作权限。
 * @date 2019-08-16 13:51
 *
 *
 *
 */
public class Main {


    public static void main(String[] args) {

        Main main = new Main();

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
}
