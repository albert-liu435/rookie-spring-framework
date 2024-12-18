package com.rookie.bigdata.designpatterns.visitor.two;

/**
 * @Class SomeOne
 * @Description 具体访问者角色类(其他人)
 * @Author rookie
 * @Date 2024/12/16 18:28
 * @Version 1.0
 */
public class SomeOne implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人给猫喂食");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人给猫喂食");
    }
}
