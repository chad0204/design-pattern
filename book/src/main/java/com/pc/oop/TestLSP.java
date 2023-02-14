package com.pc.oop;

import java.util.*;

/**
 * 里氏替换
 * <p>
 * 不会出现因为多态（子类实现不同）产生bug
 * 代码更具扩展性, 父类可以被子类安全替换。（反之是向下转型, 本身就有危险）
 * <p>
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
     * 规则三：验证子类参数必须比父类更宽松
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
     * 规则四：验证子类返回值必须必父类更严格
     * java没有这条, 因为从语言层面约束了
     * 1. 重写, 子类返回类型必须比父类小, 否则编译报错
     * 2. 重载, 前提是满足"规则三：参数比父类大", 此种情况下重载都会调用到父类方法
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