package com.pc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dx
 * @className OwnerInvocationHandler
 * @description 自己，这个对象可以填写信息和查询，但不可以打分
 *
 *
 *         装饰者和代理的区别：
 *
 *
 * @date 2019-08-16 11:21
 */
public class OwnerInvocationHandler implements InvocationHandler {


    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }





    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if(method.getName().startsWith("get") || method.getName().startsWith("set")) {
                return method.invoke(person,args);//所有人都能访问和自己能访问
            } else if(method.getName().equals("doHotOrNotRating")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();//捕获目标类发生异常
        }
        return null;
    }
}
