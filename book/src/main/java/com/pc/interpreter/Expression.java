package com.pc.interpreter;

/**
 *
 * 不管是运算符表达式还是数字表达式，解释后的返回结果都是数字
 *
 *
 * 表达式可以分为两种：
 *
 * 终结表达式，只有一个，就是数字表达式，NumberExpress
 * 非终结表达式，可以有多个，加法表达式、减法表达式。非终结表达式一般会操作相关的终结表达式来得到一个结果
 *
 * @author pengchao
 * @since 2022/8/11 15:28
 */
public interface Expression {
    int interpret();
}
