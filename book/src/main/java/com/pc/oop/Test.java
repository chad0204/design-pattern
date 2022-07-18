package com.pc.oop;

import java.util.*;

/**
 * 里氏替换
 *
 * @author pengchao
 * @since 2022/7/13 18:13
 */
public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        LinkedHashMap<String, String> hashMap = (LinkedHashMap<String, String>) new HashMap<String, String>();


        test();

    }


    public static void test() {
        //在子类有方法重载的地方，子类的重载方法的参数一定要比基类大。
//        Father childB = new Father();


        //ChildA的参数比爹大，这里只会调用爹
        ChildA child = new ChildA();
        child.doSomething(new LinkedHashMap());
        child.doSomething(new HashMap());
        List<String> valueA = child.getVale();

        //ChildB的重载方法参数比爹小，本来是调用父类的方法，竟然调用了子类
        ChildB childB = new ChildB();
        childB.doSomething(new LinkedHashMap());
        childB.doSomething(new HashMap());//这样又可以的

        //这个儿子比爹大，不能转成爹
//        List<String> valeB = childB.getVale();
    }
}

class Father {
    void doSomething(HashMap map) {
        System.out.println("爸爸的参数是hashMap");
    }

    List<String> getValue() {
        System.out.println("爸爸返回值是list");
        return new ArrayList<>();
    }

}


/**
 * 里氏的好儿子
 */
class ChildA extends Father {

    void doSomething(Map map) {
        System.out.println("儿子A的参数是Map, 依然是爸爸干 ,符合里氏替换");
    }


    LinkedList<String> getVale() {
        System.out.println("儿子A的返回值是LinkedList，可以转成爹的返回值，符合里氏替换");
        return new LinkedList<>();
    }

}

class ChildB extends Father {

    void doSomething(LinkedHashMap map) {
        System.out.println("儿子B的参数是LinkedHashMap，这里没有爸爸干，不符合里氏替换");
    }


    Collection<String> getVale() {
        System.out.println("儿子B的返回值是Collection，这个返回结果，爸爸用不了，不符合里氏替换");
        return new ArrayList<>();
    }

}


