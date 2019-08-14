package com.ljy.learn.templatemethod;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
public abstract class AbstaractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
