package com.rookie.bigdata.designpatterns.observer.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class WeatherStation
 * @Description ConcreteSubject（具体主题）：实现Subject接口，当其状态改变时，会向所有的观察者发出通知。
 * @Author rookie
 * @Date 2024/12/19 11:32
 * @Version 1.0
 */
public class WeatherStation implements Subject {
    private final List<Observer> observers;
    private float temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
