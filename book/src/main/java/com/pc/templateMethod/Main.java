package com.pc.templateMethod;

/**
 * 模版方法
 *
 *      父类提供了模版方法，模版方法中具体的功能由子类实现或者重写，子类可以在不改变算法结构的情况下重新定义算法中的某些步骤。
 *
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 调一杯咖啡的过程
         */
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();


        /**
         * 调一杯茶的过程
         */
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
