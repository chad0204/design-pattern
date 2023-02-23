package com.pc.oop;

import java.util.*;

/**
 * 里氏替换
 * <p>
 * 不会出现因为多态（子类实现不同）产生bug。父类的实现方法, 子类要保证行为一致, 不能重写, 重载也不能替换父类
 * 代码更具扩展性, 父类可以被子类安全替换。（反之是向下转型, 本身就有危险）
 * <p>
 *
 * @author pengchao
 * @since 2023/2/14 17:00
 */
public class TestLSP {

    public static void main(String[] args) {
        validateArgs();
//        validateReturn();
    }

    /**
     * 规则三：验证子类参数必须比父类更宽松
     */
    public static void validateArgs() {
        Map<String, String> map = new HashMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        System.out.println("父类执行: ");
        BaseType baseType = new BaseType();
        //传参数类型比父类大的情况需要强转, 本身就是危险的, 不考虑这种情况。（所以不怕子类入参比父类大）
//        baseType.doSomething((HashMap<String, String>) map);
        //传参类型和父类一样
        baseType.doSomething(hashMap);
        //传参类型比父类小
        baseType.doSomething(linkedHashMap);

        System.out.println("1. 用形参比父类大的取代父类: ");
        SubTypeA baseTypeA = new SubTypeA();
//        baseTypeA.doSomething(map);// error, 很具有迷惑性, 如果父类用Map作为参数需要强转, 不能直接调, 强转那么调用的还是父类
        baseTypeA.doSomething(hashMap);//ok
        baseTypeA.doSomething(linkedHashMap);//ok

        System.out.println("2. 用形参比父类小的取代父类: ");
        SubTypeB baseTypeB = new SubTypeB();
        baseTypeB.doSomething((HashMap<String, String>) map);//ok
        baseTypeB.doSomething(hashMap);//ok
        baseTypeB.doSomething(linkedHashMap);//error 参数和子类一样, 调用到子类的重载方法


//        invoke(baseType);//这种将子类赋值给父类都可以通过
    }

    /**
     * 规则四：验证子类返回值必须必父类更严格
     * java没有这条, 因为从语言层面约束了
     * 1. 重写, 子类返回类型必须比父类小, 否则编译报错
     * 2. 重载, 前提是满足"规则三：参数比父类大"（不然就是重写了）, 此种情况下重载都会调用到父类方法
     *
     */
    public static void validateReturn() {

        BaseType baseType = new BaseType();
        HashMap<String, String> hashMap = baseType.getMap(new ArrayList<>());
        Map<String, String> map = baseType.getMap(new ArrayList<>());

        SubTypeA subTypeA = new SubTypeA();
        HashMap<String, String> hashMap1 = subTypeA.getMap(new ArrayList<>());
        Map<String, String> map1 = subTypeA.getMap(new ArrayList<>());


        SubTypeB subTypeB = new SubTypeB();
        HashMap<String, String> hashMap2 = subTypeB.getMap(new ArrayList<>());
        Map<String, String> map2 = subTypeB.getMap(new ArrayList<>());

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

    public LinkedHashMap<String, String> getMap(List<String> list) {
        System.out.println("SubTypeA do getMap!");
        return new LinkedHashMap<>();
    }
}

class SubTypeB extends BaseType {

    public void doSomething(LinkedHashMap<String, String> linkedHashMap) {
        System.out.println("SubTypeB Type do something!");
    }

    /**
     * 重写返回类型不能比父类大(编译错误), 所以不考虑重写的情况
     * 参数不同就是重载, 参数相同就是重写, 和返回值无关
     * @return
     */
//    public Map<String, String> getMap(ArrayList<String> arrayList) {
//        System.out.println("SubTypeB do getMap!");
//        return new HashMap<>();
//    }

    public Map<String, String> getMap(List<String> list) {
        System.out.println("SubTypeB do getMap!");
        return new HashMap<>();
    }
}