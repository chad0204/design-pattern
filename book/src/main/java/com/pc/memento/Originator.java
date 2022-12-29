package com.pc.memento;

/**
 * 发起人
 * 包含状态
 * 可以操作创建备忘录和恢复状态
 *
 * @author pengchao
 * @since 2022/12/29 16:37
 */
public class Originator {

    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
