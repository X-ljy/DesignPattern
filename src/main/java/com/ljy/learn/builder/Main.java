package com.ljy.learn.builder;

/**
 * @author : 夕
 * @date : 2019/8/15
 */
public class Main {
    public static void main(String[] args) {
        //创建具体的建造者
        TextBuilder textBuilder = new TextBuilder();
        //创建监工
        Director director = new Director(textBuilder);
        director.construct();
        String res = textBuilder.getResult();
        System.out.println(res);
    }
}
