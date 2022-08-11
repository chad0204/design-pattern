package com.pc.interpreter;

/**
 *
 * @author pengchao
 * @since 2022/8/11 15:30
 */
public class SubOperator extends OperatorExpress {

    public SubOperator(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
