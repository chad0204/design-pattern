package com.pc.interpreter;

/**
 * 数字表达式
 *
 * @author pengchao
 * @since 2022/8/11 15:29
 */
public class NumberExpress implements Expression {
    private int number;

    public NumberExpress(char word) {
        switch (word) {
            case '零':
                this.number = 0;
                break;
            case '一':
                this.number = 1;
                break;
            case '二':
                this.number = 2;
                break;
            case '三':
                this.number = 3;
                break;
            case '四':
                this.number = 4;
                break;
            case '五':
                this.number = 5;
                break;
            case '六':
                this.number = 6;
                break;
            case '七':
                this.number = 7;
                break;
            case '八':
                this.number = 8;
                break;
            case '九':
                this.number = 9;
                break;
            default:
                break;
        }
    }

    @Override
    public int interpret() {
        return number;
    }
}
