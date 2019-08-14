package com.ljy.learn.templatemethod;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
public class Main {

    public static void main(String[] args) {
        AbstaractDisplay display = new CharDisplay('L');
        AbstaractDisplay display1 = new StringDisplay("hello world");

        display.display();
        display1.display();
    }
}
