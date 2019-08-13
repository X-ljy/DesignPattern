package com.ljy.learn.decorator;

/**
 * @author : 夕
 * @date : 2019/8/13
 */
public class Main {

    public static void main(String[] args) {
        Display b1 = new StringDisplay("hello world");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

        Display b4 = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("落霞与孤鹜齐飞")
                                ), '*'
                        )
                ), '/'
        );

        b4.show();
    }
}
