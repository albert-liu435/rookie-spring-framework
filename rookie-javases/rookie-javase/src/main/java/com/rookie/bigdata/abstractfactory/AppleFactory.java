package com.rookie.bigdata.abstractfactory;

/**
 * @Class AppleFactory
 * @Description 苹果工厂
 * @Author rookie
 * @Date 2024/12/12 18:26
 * @Version 1.0
 */
public class AppleFactory extends AbstractFactory {
    @Override
    Phone createPhone() {
        return new IPhone();
    }

    @Override
    Computer createComputer() {
        return new MacBook();
    }
}
