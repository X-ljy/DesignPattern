package com.ljy.learn.factorymethod;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();

        Product card1 = factory.create("test1");
        Product card2 = factory.create("test2");
        Product card3 = factory.create("test3");
        Product card4 = factory.create("test4");

        card1.use();
        card2.use();
        card3.use();
        card4.use();
    }
}
