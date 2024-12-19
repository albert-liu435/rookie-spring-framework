package com.rookie.bigdata.designpatterns.observer.one;

/**
 * @Class Subject
 * @Description Subject（主题）：拥有添加和删除观察者的方法，以及通知所有观察者状态变化的方法。
 * @Author rookie
 * @Date 2024/12/19 11:32
 * @Version 1.0
 */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
