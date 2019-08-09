package com.ljy.learn.adapter.interfaceadapter;

/**
 * @author : 夕
 * @date : 2019/8/9
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需覆盖我们需要使用的接口方法
            @Override
            public void m1() {
                System.out.println("使用m1方法");
            }
        };
        absAdapter.m1();
    }
}
