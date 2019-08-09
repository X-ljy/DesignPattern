package com.ljy.learn.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : Ϧ
 * @date : 2019/8/9
 */
public class ProxyFactory implements MethodInterceptor {

    //ά��һ��Ŀ�����
    private Object target;

    //������������һ��������Ķ���
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //����һ��������� ��target�Ĵ������
    public Object getProxyInstance() {
        //1. ����һ��������
        Enhancer enhancer = new Enhancer();
        //2. ���ø���
        enhancer.setSuperclass(target.getClass());
        //3. ���ûص�����
        enhancer.setCallback(this);
        //4. ����������󣬼��������
        return enhancer.create();
    }

    //��д intercept �����������Ŀ�����ķ���
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib ���� ��ʼ");
        Object returnVal = method.invoke(target, args);
        System.out.println("Cglib ���� ����");
        return returnVal;
    }
}
