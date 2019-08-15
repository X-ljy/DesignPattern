package com.ljy.learn.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author : 夕
 * @date : 2019/8/15
 */
public abstract class NumberGenerator {

    private ArrayList observers = new ArrayList(); //保存Observer

    public void addObserver(Observer observer) {  //注册Observer
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {  //删除Observer
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();

}
