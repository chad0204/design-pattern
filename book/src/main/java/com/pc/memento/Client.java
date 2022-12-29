package com.pc.memento;

/**
 *
 * @author pengchao
 * @date 22:41 2022/8/16
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("心情不错！");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("心情很差！");

        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());

        System.out.println(originator.getState());
    }
}
