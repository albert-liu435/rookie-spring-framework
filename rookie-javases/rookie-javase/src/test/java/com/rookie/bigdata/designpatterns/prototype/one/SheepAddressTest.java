package com.rookie.bigdata.designpatterns.prototype.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class SheepAddressTest
 * @Description https://blog.csdn.net/weixin_42109071/article/details/128530179
 * @Author rookie
 * @Date 2024/12/19 11:05
 * @Version 1.0
 */
class SheepAddressTest {



    @Test
    void test01(){
        Sheep sheep = new Sheep("多莉", new SheepAddress("内蒙古", "呼和浩特市"));
        System.out.println("sheep对象的hashcode:" + sheep.hashCode() + " sheepAddress对象的hashcode:" + sheep.sheepAddress.hashCode() + " 属性值：" + sheep);

        Sheep sheep1 = new Sheep("多莉1", new SheepAddress("内蒙古1", "呼和浩特市1"));
        System.out.println("sheep对象的hashcode:" + sheep1.hashCode() + " sheepAddress对象的hashcode:" + sheep1.sheepAddress.hashCode() + " 属性值：" + sheep1);

        Sheep sheep2 = new Sheep("多莉2", new SheepAddress("内蒙古2", "呼和浩特市2"));
        System.out.println("sheep对象的hashcode:" + sheep2.hashCode() + " sheepAddress对象的hashcode:" + sheep2.sheepAddress.hashCode() + " 属性值：" + sheep2);

    }

}
