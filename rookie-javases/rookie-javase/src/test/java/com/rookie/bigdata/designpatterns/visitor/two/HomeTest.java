package com.rookie.bigdata.designpatterns.visitor.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class HomeTest
 * @Description https://blog.csdn.net/weixin_43004044/article/details/134313659
 * @Author rookie
 * @Date 2024/12/16 18:29
 * @Version 1.0
 */
class HomeTest {

    @Test
    void test01(){
        //创建 Home 对象
        Home home = new Home();
        //添加元素到 Home 对象中
        home.add(new Dog());
        home.add(new Cat());

        //创建主人对象
        Owner owner = new Owner();
        //让主人喂食所有的宠物
        home.action(owner);

        System.out.println("===============");

        //创建其他人对象
        SomeOne someOne = new SomeOne();
        //让其他人喂食所有的宠物
        home.action(someOne);
    }

}
