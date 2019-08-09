package com.ljy.learn.proxy.cglibproxy;

/**
 * @author : 夕
 * @date : 2019/8/9
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        Teacher target = new Teacher();
        //获取代理对象，并且将目标对象传递给代理对象
        Teacher proxyInstance = (Teacher) new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法，触发intercept方法，实现对目标对象的调用
        proxyInstance.Teach("ljy");
    }
}
