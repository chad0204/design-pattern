package com.pc.templateMethod;

import java.util.Arrays;

/**
 * @author dx
 * @className Test
 * @description TODO
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
