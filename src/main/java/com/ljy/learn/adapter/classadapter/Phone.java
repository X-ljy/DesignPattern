package com.ljy.learn.adapter.classadapter;

/**
 * @author : 夕
 * @date : 2019/8/9
 */
public class Phone {
    //充电
    public void Charging(Voltage5Vable voltage5Vable) {
        if (voltage5Vable.output5V() == 5) {
            System.out.println("电压为5伏，可以充电");
        } else if (voltage5Vable.output5V() > 5) {
            System.out.println("电压大于5伏，无法充电");
        }
    }
}
