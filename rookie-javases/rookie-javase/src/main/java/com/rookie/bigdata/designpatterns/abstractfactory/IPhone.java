package com.rookie.bigdata.designpatterns.abstractfactory;

/**
 * @Class IPhone
 * @Description 苹果手机
 * @Author rookie
 * @Date 2024/12/12 18:26
 * @Version 1.0
 */
public class IPhone extends Phone {
    @Override
    void launch() {
        System.out.println("iphone is launched");
    }
}
