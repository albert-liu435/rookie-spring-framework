package com.rookie.bigdata.designpatterns.templatemethod;

/**
 * @Class Coffee
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:15
 * @Version 1.0
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}
