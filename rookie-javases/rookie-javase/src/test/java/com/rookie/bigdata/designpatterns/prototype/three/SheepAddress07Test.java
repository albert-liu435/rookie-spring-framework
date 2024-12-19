package com.rookie.bigdata.designpatterns.prototype.three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class SheepAddress07Test
 * @Description
 * @Author rookie
 * @Date 2024/12/19 11:11
 * @Version 1.0
 */
class SheepAddress07Test {


    @Test
    void test01()throws Exception{
        SheepClone07 sheep = new SheepClone07("多莉", new SheepAddress07("内蒙古", "呼和浩特市"));
        sheep.printSheep();
        System.out.println("sheep对象-->hashcode值:" + sheep.hashCode() + " sheepAddress对象的hashcode值:" + sheep.sheepAddress.hashCode() + " 属性值：" + sheep);

        System.out.println();
        System.out.println("开始深拷贝方式一SheepClone对象(通过重写clone方法实现深拷贝)...");
        SheepClone07 cloneSheepOne = (SheepClone07) sheep.clone();
        cloneSheepOne.setName("绵羊");
        cloneSheepOne.printSheep();
        System.out.println("克隆sheep对象-->hashcode值:" + cloneSheepOne.hashCode() + " sheepAddress对象的hashcode值:" + cloneSheepOne.sheepAddress.hashCode() + " 属性值: " + cloneSheepOne);

        System.out.println();
        System.out.println("开始深拷贝方式二序列化SheepClone对象(通过序列化反序列化实现深拷贝)...");
        SheepClone07 cloneSheepTwo = (SheepClone07) sheep.deepClone();
        cloneSheepTwo.printSheep();
        System.out.println("克隆sheep对象-->hashcode值:" + cloneSheepTwo.hashCode() + " sheepAddress对象的hashcode值:" + cloneSheepTwo.sheepAddress.hashCode() + " 属性值: " + cloneSheepTwo);

        System.out.println();
        System.out.println("两个对象值分别为 sheep=" + sheep +" cloneSheepOne="+cloneSheepOne+" cloneSheepTwo="+cloneSheepTwo);
    }

}
