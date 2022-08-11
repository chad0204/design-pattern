package com.pc.interpreter;

import java.util.Stack;

/**
 * 进行运算，对表达式有一下要求
 *
 * 1. 数字表达式只有0到9
 * 2. 数字表达式和运算符表达式必须交替
 * 3. 首字符必须是数字表达式
 *
 * @author pengchao
 * @since 2022/8/11 15:26
 */
public class Calculate {

    public static int calculate(String expression) {
        Stack<Expression> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            switch (c) {
                case '加':
                    //这里取后面一位，并跳过后面一位
                    stack.push(new AddOperator(stack.pop(), new NumberExpress(expression.charAt(++i))));
                    break;
                case '减':
                    stack.push(new SubOperator(stack.pop(), new NumberExpress(expression.charAt(++i))));
                    break;
                default:
                    stack.push(new NumberExpress(c));
                    break;
            }
        }
        return stack.pop().interpret();
    }
}
