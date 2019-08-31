package com.pc.iterator.component;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author dx
 * @className CompositeIterator
 * @description 外部混合迭代器
 * @date 2019-08-14 18:40
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    Stack<Iterator> stack = new Stack<>();//用来记录在树形结构中的位置

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()) {
            return false;
        } else {
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()) {
                stack.pop();//取出并移除
                return hasNext();//递归
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
