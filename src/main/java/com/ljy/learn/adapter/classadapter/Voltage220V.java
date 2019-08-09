package com.ljy.learn.adapter.classadapter;

/**
 * @author : 夕
 * @date : 2019/8/9
 */

//被适配的类
public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("电压 : " + src + "伏");
        return src;
    }
}
