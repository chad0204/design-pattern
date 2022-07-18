package com.pc.oop;

/**
 * 依赖倒置
 *
 * @author pengchao
 * @since 2022/7/14 20:56
 */
public class TestDI {


}

interface A {

}

class A1 implements A {
    //这就叫依赖倒置
    B b;
    A1(B b) {
       this.b = b;
    }
}

class A2 implements A {

}

interface B {

}

class B1 implements B {

}
