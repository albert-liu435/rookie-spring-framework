package com.rookie.bigdata.designpatterns.visitor.two;

/**
 * @Class Cat
 * @Description 具体元素角色类（宠物猫）
 * @Author rookie
 * @Date 2024/12/16 18:26
 * @Version 1.0
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        //访问者给宠物猫喂食
        person.feed(this);
        System.out.println("宠物猫接受喂食");
    }
}

