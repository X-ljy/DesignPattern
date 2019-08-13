package com.ljy.learn.decorator;

/**
 * @author : 夕
 * @date : 2019/8/13
 */
public abstract class Border extends Display {

    protected Display display;

    Border(Display display) {
        this.display = display;
    }
}
