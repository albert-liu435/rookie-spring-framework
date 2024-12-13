package com.rookie.bigdata.designpatterns.abstractfactory;

/**
 * @Class MiPhone
 * @Description 小米手机
 * @Author rookie
 * @Date 2024/12/12 18:29
 * @Version 1.0
 */
public class MiPhone extends Phone {
    @Override
    void launch() {
        System.out.println("MI  phone is launched");
    }
}
