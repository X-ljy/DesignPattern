package com.ljy.learn.proxy.staticproxy;

/**
 * @author : Ϧ
 * @date : 2019/8/8
 */

//������󣬾�̬����
public class TeachProxy implements Teacherable {

    private Teacherable target; //  Ŀ�����ͨ���ӿھۺ�

    //������
    public TeachProxy(Teacherable target) {
        this.target = target;
    }

    @Override
    public void Teach() {
        System.out.println("����ʼ ���ĳЩ����");
        target.Teach();
        System.out.println("���������������");
    }
}
