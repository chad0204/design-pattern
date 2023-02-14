package com.pc.oop;

import java.util.*;

/**
 * 里氏替换
 *
 * @author pengchao
 * @since 2023/2/14 17:00
 */
public class TestLSP {

    public static void main(String[] args) {
//        validateArgs();
        validateReturn();
    }

    /**
     * 验证子类参数必须比父类更宽松
     */
    public static void validateArgs() {
        Map<String, String> map = new HashMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

//        BaseType baseType = new BaseType();
//        SubTypeA baseType = new SubTypeA();//SubTypeA替换BaseType
        SubTypeB baseType = new SubTypeB();//SubTypeB替换BaseType
//        子类比父类参数类型宽松的重载方法, 父类调用参数向下转型需要强转（也就是父类不该这样调用）。所以当baseType替换成SubTypeA后, 也没有问题
        baseType.doSomething((HashMap<String, String>) map);
        baseType.doSomething(hashMap);
        //子类比父类参数类型严格的重载方法, 当入参正好是子类的参数类型时, 会调用到子类
        baseType.doSomething(linkedHashMap);

//        invoke(baseType);//这种将子类赋值给父类都可以通过
    }

    /**
     * 验证子类返回值必须必父类更严格
     */
    public static void validateReturn() {

        List<String> list = new ArrayList<>();

        BaseType baseType = new BaseType();
//        SubTypeA baseType = new SubTypeA();
//        SubTypeB baseType = new SubTypeB();


        HashMap<String, String> hashMap = baseType.getMap(new ArrayList<>());

    }


    public static void invoke(BaseType baseType) {
        Map<String, String> map = new HashMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        //子类比父类参数类型宽松的重载方法, 父类调用参数向下转型需要强转。当baseType替换成SubTypeA后, 也没有问题
        baseType.doSomething((HashMap<String, String>) map);
        baseType.doSomething(hashMap);
        //子类比父类参数类型严格的重载方法, 因为是父类引用, 也会调用父类方法
        baseType.doSomething(linkedHashMap);
    }

}

class BaseType {
    public void doSomething(HashMap<String, String> hashMap) {
        System.out.println("BaseType do something!");
    }

    public HashMap<String, String> getMap(ArrayList<String> list) {
        System.out.println("BaseType do getMap!");
        return new HashMap<>();
    }
}

class SubTypeA extends BaseType {
    public void doSomething(Map<String, String> map) {
        System.out.println("SubTypeA Type do something!");
    }

    public LinkedHashMap<String, String> getMap(ArrayList<String> list) {
        System.out.println("SubTypeA do getMap!");
        return new LinkedHashMap<>();
    }
}

class SubTypeB extends BaseType {

    public void doSomething(LinkedHashMap<String, String> linkedHashMap) {
        System.out.println("SubTypeB Type do something!");
    }

    /**
     * 重写返回类型不能比父类大, 所以不考虑重写的情况
     * 参数不同就是重载, 参数相同就是重写, 和返回值无关
     * @return
     */
//    public Map<String, String> getMap(ArrayList<String> arrayList) {
//        System.out.println("SubTypeB do getMap!");
//        return new HashMap<>();
//    }

    public Map<String, String> getMap(ArrayList<String> list) {
        System.out.println("SubTypeB do getMap!");
        return new HashMap<>();
    }
}