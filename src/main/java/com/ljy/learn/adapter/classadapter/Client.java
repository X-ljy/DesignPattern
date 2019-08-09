package com.ljy.learn.adapter.classadapter;

/**
 * @author : 夕
 * @date : 2019/8/9
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("==== 类适配器 ====");
        Phone p = new Phone();
        p.Charging(new VoltageAdapter());
    }

}