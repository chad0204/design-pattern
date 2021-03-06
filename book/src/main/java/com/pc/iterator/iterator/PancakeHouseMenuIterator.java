package com.pc.iterator.iterator;

import java.util.List;
import java.util.Iterator;

/**
 * @author dx
 * @className DinerMenuIterator
 * @description 使用自定义迭代器接口
 * @date 2019-08-13 20:06
 */
@Deprecated
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

    List<MenuItem> items;//数组迭代器
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
