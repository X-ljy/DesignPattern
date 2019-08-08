package com.ljy.learn.proxy.staticproxy;

/**
 * @author : 夕
 * @date : 2019/8/8
 */

//代理对象，静态代理
public class TeachProxy implements Teacherable {

    private Teacherable target; //  目标对象，通过接口聚合

    //构造器
    public TeachProxy(Teacherable target) {
        this.target = target;
    }

    @Override
    public void Teach() {
        System.out.println("代理开始 完成某些操作");
        target.Teach();
        System.out.println("代理结束。。。。");
    }
}
