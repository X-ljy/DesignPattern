package com.ljy.learn.adapter.classadapter;

/**
 * @author : 夕
 * @date : 2019/8/9
 */
//适配器
public class VoltageAdapter extends Voltage220V implements Voltage5Vable {
    @Override
    public int output5V() {
        //获取220V电压
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
