package com.pc.iterator.iterator;

import java.util.Iterator;
/**
 * @author dx
 * @className DinerMenuIterator
 * @description 使用java自带的迭代器接口
 * @date 2019-08-13 20:06
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;//数组迭代器
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
