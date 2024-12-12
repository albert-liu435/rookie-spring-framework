package com.rookie.bigdata.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class AbstractFactoryTest
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:30
 * @Version 1.0
 */
class AbstractFactoryTest {


    @Test
    void test01() {
        //苹果工厂
        AbstractFactory appleFactory = new AppleFactory();
        Phone iphone = appleFactory.createPhone();
        Computer macBook = appleFactory.createComputer();
        iphone.launch();
        macBook.launch();
        System.out.println();

        //小米工厂
        AbstractFactory miFactory = new MiFactory();
        Phone miPhone = miFactory.createPhone();
        Computer miBook = miFactory.createComputer();
        miPhone.launch();
        miBook.launch();

    }

}
