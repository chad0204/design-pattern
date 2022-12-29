package com.pc.memento;

/**
 * 备忘录管理者, 持有备忘录
 *
 * @author pengchao
 * @since 2022/12/29 16:39
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
