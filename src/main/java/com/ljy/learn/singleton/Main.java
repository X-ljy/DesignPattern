package com.ljy.learn.singleton;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(" Start. ");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        if (singleton == singleton1) {
            System.out.println("是相同实例");
        } else {
            System.out.println("不是相同实例");
        }

        System.out.println("End.");
    }
}
