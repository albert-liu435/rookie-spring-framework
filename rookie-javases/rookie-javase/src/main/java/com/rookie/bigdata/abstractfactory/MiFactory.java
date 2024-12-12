package com.rookie.bigdata.abstractfactory;

/**
 * @Class MiFactory
 * @Description 小米工厂
 * @Author rookie
 * @Date 2024/12/12 18:29
 * @Version 1.0
 */
public class MiFactory extends AbstractFactory {
    @Override
    Phone createPhone() {
        return new MiPhone();
    }

    @Override
    Computer createComputer() {
        return new MiBook();
    }
}
