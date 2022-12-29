package com.pc.memento;

/**
 * 备忘录
 * 记录状态
 * 可以操作获取状态
 *
 * @author pengchao
 * @since 2022/12/29 16:38
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
