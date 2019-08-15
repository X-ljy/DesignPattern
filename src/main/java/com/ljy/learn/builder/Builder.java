package com.ljy.learn.builder;

/**
 * @author : 夕
 * @date : 2019/8/15
 */

//Builder（建造者）负责定义生成实例的接口
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
