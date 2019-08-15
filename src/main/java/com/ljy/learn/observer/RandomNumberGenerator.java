package com.ljy.learn.observer;

import java.util.Random;

/**
 * @author : 夕
 * @date : 2019/8/15
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random(); //随机数生成器
    private int number;                     //当前数值

    //获取当前数值
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
