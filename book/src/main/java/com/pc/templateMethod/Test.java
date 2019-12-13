package com.pc.templateMethod;

import java.util.Arrays;

/**
 * @author dx
 * @className Test
 * @description
 *      java Api中的模版方法：
 *      Arrays.sort调用的mergeSort是一个模版方法，提供了算法结构，模版方法中的compareTo方法和swap方法提供了算法的步骤。
 *      compareTo方法由其子类（SortDemo）实现，swap方法在数组中实现。
 *
 *
 *      这是一个模版方法变种，因为我们无法设计一个类继承数组，所以提供一个静态方法，由传入的对象自己提供比较算法的实现。
 *      这里有点像策略模式，通过传入的对象来决定行为，但区别是策略模式的对象提供了完整算法，模版模式的对象只提供部分算法。
 *
 * @date 2019-08-13 16:47
 */
public class Test {

    public static void main(String[] args) {
        SortDemo[] arr = {new SortDemo("aa"),new SortDemo("bb")};
        Arrays.sort(arr);//sort为模版方法
    }
}


class SortDemo implements Comparable<SortDemo> {//由于数据不能被继承，所以借助Comparable来提供步骤。
    private String name;

    public SortDemo(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(SortDemo o) {
        return name.compareTo(o.name);
    }
}
