package com.ljy.learn.singleton;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
