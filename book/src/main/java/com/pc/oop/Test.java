package com.pc.oop;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author pengchao
 * @since 2022/7/13 18:13
 */
public class Test {

    public static void main(String[] args) {

        f(new ChildA());

    }


    public static void f(Father father) {
        father.f(new HashMap<>());
    }
}

class Father {
    String f(HashMap<String, String> map) {
        return map.get("");
    }
}

class Child extends Father {

    String f(Map<String, String> map) {
        return map.get("");
    }
}

class ChildA extends Father {

    String f(LinkedHashMap<String, String> map) {
        return map.get("");
    }
}
