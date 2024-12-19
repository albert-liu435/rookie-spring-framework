package com.rookie.bigdata.designpatterns.prototype.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class SheepAddress06Test
 * @Description
 * @Author rookie
 * @Date 2024/12/19 11:07
 * @Version 1.0
 */
class SheepAddress06Test {

    /**
     * 原型设计模式是一种创建型设计模式，允许一个对象再创建另一个可定制的对象，无需知道如何创建对象的细节，
     * springmvc框架中的单例（singleton）与多例（prototype）正是基于该设计模式而设计的。
     * 原型设计模式分为俩种，一种是浅拷贝，另一种是深拷贝。浅拷贝指的是对于基本数据类型和引用类型的变量通过值传递和引用传递，
     * 通俗易懂的说法就是，原对象的任何更改都会影响到克隆对象。而深拷贝是通过完整的克隆，重新创建一个新的对象，
     * 原对象的更改不会影响到克隆对象。浅拷贝通过实现Cloneable接口，重写clone方法实现。
     * 深拷贝可以通过重写clone方法或者实现Serializable序列化接口，通过序列化实现对象深拷贝。
     * 多用于复杂对象的创建，简化对象创建过程。本节我们以克隆多莉羊为例，实现原型模式的一个案例。
     *
     * 原型设计模式：浅拷贝，创建一只多莉羊并实现其Cloneable接口
     */

    @Test
    void test01()throws Exception{
        SheepClone06 sheep = new SheepClone06("多莉", new SheepAddress06("内蒙古", "呼和浩特市"));
        sheep.printSheep();
        System.out.println("sheep对象-->hashcode值:" + sheep.hashCode() + " sheepAddress对象的hashcode值:" + sheep.sheepAddress.hashCode() + " 属性值：" + sheep);
        //调用克隆方法克隆一只多莉羊
        System.out.println();
        System.out.println("开始浅拷贝SheepClone对象...");
        SheepClone06 cloneSheep = (SheepClone06) sheep.clone();
        cloneSheep.printSheep();
        //更改多莉羊的产地
        sheep.getSheepAddress().setProvince("新疆");
        sheep.getSheepAddress().setCity("乌鲁木齐");
        //克隆的多莉羊属性
        System.out.println("克隆sheep对象-->hashcode值:" + cloneSheep.hashCode() + " sheepAddress对象的hashcode值:" + cloneSheep.sheepAddress.hashCode() + " 属性值: " + cloneSheep);

        System.out.println();
        System.out.println("两个对象值分别为 sheep=" + sheep +" cloneSheep="+cloneSheep);
    }


}
