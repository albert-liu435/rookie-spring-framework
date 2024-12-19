package com.rookie.bigdata.designpatterns.observer.one;

/**
 * @Class TemperatureDisplay
 * @Description 温度显示器
 *
 *ConcreteObserver（具体观察者）：实现Observer接口，定义当接收到主题状态变化通知时如何更新自己。
 *
 * @Author rookie
 * @Date 2024/12/19 11:33
 * @Version 1.0
 */
public class TemperatureDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("TemperatureDisplay: Temperature changed to: " + temperature);
    }
}
