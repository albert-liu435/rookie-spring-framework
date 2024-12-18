package com.rookie.bigdata.designpatterns.visitor.two;

/**
 * @Class Owner
 * @Description 具体访问者角色类(宠物主人)
 * @Author rookie
 * @Date 2024/12/16 18:27
 * @Version 1.0
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人给猫喂食");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人给狗喂食");
    }
}

