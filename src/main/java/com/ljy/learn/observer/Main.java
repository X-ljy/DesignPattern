package com.ljy.learn.observer;

/**
 * @author : 夕
 * @date : 2019/8/15
 */
public class Main {

    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();

        Observer observer1 = new DigitObserver();

        generator.addObserver(observer1);

        generator.execute();
    }
}
