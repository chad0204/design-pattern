package com.pc.interpreter;

import java.util.Stack;

/**
 * 首字符一定是数字
 * 运算符和数字必须交替出现
 *
 * @author pengchao
 * @since 2022/8/11 14:52
 */
public class Client {

    public static void main(String[] args) {

        String expression = "一加五加九减九减二";//4

        int calculate = Calculate.calculate(expression);

        System.out.println(calculate);

    }
}
