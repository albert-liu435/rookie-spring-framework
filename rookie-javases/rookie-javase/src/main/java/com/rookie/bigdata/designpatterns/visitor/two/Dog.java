package com.rookie.bigdata.designpatterns.visitor.two;

/**
 * @Class Dog
 * @Description 具体元素角色类（宠物狗）
 * @Author rookie
 * @Date 2024/12/16 18:27
 * @Version 1.0
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        //访问者给宠物狗喂食
        person.feed(this);
        System.out.println("宠物狗接受喂食");
    }
}

