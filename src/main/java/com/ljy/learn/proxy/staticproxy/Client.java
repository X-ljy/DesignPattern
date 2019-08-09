package com.ljy.learn.proxy.staticproxy;

/**
 * @author : 夕
 * @date : 2019/8/8
 */
public class Client {
    /**
     * 创建Teach对象
     * 创建TeachProxy代理对象
     * 将Teach对象，交给TeachProxy对象执行方法
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建目标对象，被代理对象
        Teach teach = new Teach();
        //创建代理对象，同时将被代理对象传递给代理对象
        TeachProxy teachProxy = new TeachProxy(teach);
        //通过代理对象，调用代理对象的方法
        //执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teachProxy.Teach();
    }
}
