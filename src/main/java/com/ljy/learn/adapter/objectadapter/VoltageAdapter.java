package com.ljy.learn.adapter.objectadapter;

/**
 * @author : 夕
 * @date : 2019/8/9
 */
//适配器
public class VoltageAdapter implements Voltage5Vable {

    private Voltage220V voltage220V;

    //通过构造器传入Voltage220V实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();//获取220电压
            System.out.println("使用对象适配器转换");
            dst = src / 44;
            System.out.println("适配完成: " + dst + "伏");
        }
        return dst;
    }
}
