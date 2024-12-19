package com.rookie.bigdata.designpatterns.observer.one;

/**
 * @Class Observer
 * @Description Observer（观察者）：所有观察者需要实现的接口，定义了当主题状态改变时需要调用的更新方法。
 * @Author rookie
 * @Date 2024/12/19 11:31
 * @Version 1.0
 */
public interface Observer {
    void update(float temperature);
}
