package com.ljy.learn.proxy.dynamicproxy;

/**
 * @author : Ϧ
 * @date : 2019/8/8
 */
public class Client {

    public static void main(String[] args) {
        //����Ŀ�����
        Teacherable target = new Teacher();

        //��Ŀ����󣬴����������
        Teacherable proxyInstance = (Teacherable) new ProxyFactory(target).getProxyInstance();
        //class com.sun.proxy.$Proxy0  �ڴ��ж�̬�����˴������
        System.out.println(proxyInstance.getClass());
        //ͨ������������Ŀ�����ķ���
        proxyInstance.Teach("ljy");

    }
}
