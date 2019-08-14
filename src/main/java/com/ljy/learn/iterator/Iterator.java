package com.ljy.learn.iterator;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
//迭代器接口，需要具体迭代器，实现此接口
public interface Iterator {
    public abstract boolean hasNext();

    public abstract Object next();
}
