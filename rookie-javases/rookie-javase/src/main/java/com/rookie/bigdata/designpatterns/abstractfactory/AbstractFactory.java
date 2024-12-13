package com.rookie.bigdata.designpatterns.abstractfactory;

/**
 * @Class AbstractFactory
 * @Description 抽象工厂
 * @Author rookie
 * @Date 2024/12/12 18:23
 * @Version 1.0
 */
public abstract class AbstractFactory {

    /**
     * 生产手机
     *
     * @return 手机
     */
    abstract Phone createPhone();

    /**
     * 生产电脑
     *
     * @return 电脑
     */
    abstract Computer createComputer();
}
