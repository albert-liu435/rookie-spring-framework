package com.rookie.bigdata.designpatterns.observer.one;

/**
 * @Class Fan
 * @Description 风扇
 * ConcreteObserver（具体观察者）：实现Observer接口，定义当接收到主题状态变化通知时如何更新自己。
 * @Author rookie
 * @Date 2024/12/19 11:33
 * @Version 1.0
 */
public class Fan implements Observer {
    @Override
    public void update(float temperature) {
        if(temperature > 25) {
            System.out.println("Fan turned on");
        } else {
            System.out.println("Fan turned off");
        }
    }
}
