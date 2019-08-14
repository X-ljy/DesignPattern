package com.ljy.learn.templatemethod;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
public class CharDisplay extends AbstaractDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
