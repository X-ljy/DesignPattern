package com.ljy.learn.proxy.dynamicproxy;

/**
 * @author : 夕
 * @date : 2019/8/8
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        Teacherable target = new Teacher();

        //给目标对象，创建代理对象
        Teacherable proxyInstance = (Teacherable) new ProxyFactory(target).getProxyInstance();
        //class com.sun.proxy.$Proxy0  内存中动态生成了代理对象
        System.out.println(proxyInstance.getClass());
        //通过代理对象调用目标对象的方法
        proxyInstance.Teach("ljy");

    }
}
