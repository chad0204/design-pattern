package com.pc.iterator.component;

import java.util.Iterator;

/**
 * @author dx
 * @className NullIterator
 * @description TODO
 * @date 2019-08-14 19:04
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
