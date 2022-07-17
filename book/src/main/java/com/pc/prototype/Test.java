package com.pc.prototype;

/**
 * TODO
 *
 * @author pengchao
 * @date 21:42 2022/7/17
 */
public class Test {
}



class Prototype implements Cloneable {
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
