package com.rookie.bigdata.designpatterns.visitor.two;

/**
 * @Class Animal
 * @Description 抽象元素角色类
 * @Author rookie
 * @Date 2024/12/16 18:26
 * @Version 1.0
 */
public interface Animal {
    //接受访问者访问的功能
    void accept(Person person);
}
