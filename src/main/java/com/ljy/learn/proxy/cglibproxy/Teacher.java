package com.ljy.learn.proxy.cglibproxy;

/**
 * @author : 夕
 * @date : 2019/8/9
 */
public class Teacher {
    void Teach(String name) {
        System.out.println("Cglib代理: " + name + " : 正在授课");
    }

}
