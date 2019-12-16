package com.pc.iterator.iterator;

/**
 * 自定义迭代器接口
 */
@Deprecated
public interface Iterator<E>  {
    boolean hasNext();
    E next();
}
