package com.ljy.learn.proxy.dynamicproxy;

/**
 * @author : Ϧ
 * @date : 2019/8/8
 */
public class Teacher implements Teacherable {
    @Override
    public void Teach(String name) {
        System.out.println(name + " : �����ڿ�");
    }
}
