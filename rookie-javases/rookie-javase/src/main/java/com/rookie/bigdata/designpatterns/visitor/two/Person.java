package com.rookie.bigdata.designpatterns.visitor.two;

/**
 * @Class Person
 * @Description 抽象访问者角色接口
 * @Author rookie
 * @Date 2024/12/16 18:25
 * @Version 1.0
 */
public interface Person {

    //给宠物猫喂食
    void feed(Cat cat);

    //给宠物狗喂食
    void feed(Dog dog);
}
