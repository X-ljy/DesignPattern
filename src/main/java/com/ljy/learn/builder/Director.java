package com.ljy.learn.builder;

/**
 * @author : 夕
 * @date : 2019/8/15
 */
//监工，使用Builder角色定义的接口来生成实例。
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeItems(new String[]{
                "晚上好。",
                "晚安。",
                "再见。",
        });
        builder.close();
    }
}
