package com.pc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dx
 * @className OwnerInvocationHandler
 * @description 别人，这个代理后的对象可以打分和查询，不可以填写信息
 * @date 2019-08-16 11:21
 *
 *
 */
public class NonOwnerInvocationHandler implements InvocationHandler {


    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if(method.getName().startsWith("get") || method.getName().equals("doHotOrNotRating")) {
                return method.invoke(person,args);//所有人都能访问和外人能访问
            } else if(method.getName().startsWith("set")) {
                throw new IllegalAccessException();//外人不能访问
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();//捕获目标类发生异常
        }
        return null;
    }
}
