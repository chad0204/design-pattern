package com.pc.interpreter;

/**
 * 数字表达式
 *
 * @author pengchao
 * @since 2022/8/11 15:29
 */
public abstract class OperatorExpress implements Expression {

    protected Expression left;
    protected Expression right;

    public OperatorExpress(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
