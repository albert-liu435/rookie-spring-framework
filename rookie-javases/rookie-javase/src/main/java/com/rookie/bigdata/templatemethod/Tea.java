package com.rookie.bigdata.templatemethod;

/**
 * @Class Tea
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:15
 * @Version 1.0
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
