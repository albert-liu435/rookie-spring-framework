package com.rookie.bigdata.designpatterns.observer.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class TemperatureDisplayTest
 * @Description https://www.cnblogs.com/zjw-blog/p/18059579
 * @Author rookie
 * @Date 2024/12/19 11:34
 * @Version 1.0
 */
class TemperatureDisplayTest {


    @Test
    void test01(){
        WeatherStation station = new WeatherStation();
        TemperatureDisplay display = new TemperatureDisplay();
        Fan fan = new Fan();

        station.addObserver(display);
        station.addObserver(fan);

        station.setTemperature(30);
        station.setTemperature(20);
    }

}
