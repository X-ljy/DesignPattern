package com.ljy.learn.proxy.staticproxy;

/**
 * @author : Ϧ
 * @date : 2019/8/8
 */
public class Client {
    /**
     * ����Teach����
     * ����TeachProxy�������
     * ��Teach���󣬽���TeachProxy����ִ�з���
     *
     * @param args
     */
    public static void main(String[] args) {
        //����Ŀ����󣬱��������
        Teach teach = new Teach();
        //�����������ͬʱ����������󴫵ݸ��������
        TeachProxy teachProxy = new TeachProxy(teach);
        //ͨ��������󣬵��ô������ķ���
        //ִ�е��Ǵ������ķ��������������ȥ����Ŀ�����ķ���
        teachProxy.Teach();
    }
}
