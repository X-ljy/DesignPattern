package com.ljy.learn.observer;

/**
 * @author : 夕
 * @date : 2019/8/15
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver : " + generator.getNumber());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
