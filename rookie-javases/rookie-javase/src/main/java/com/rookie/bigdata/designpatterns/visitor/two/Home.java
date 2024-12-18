package com.rookie.bigdata.designpatterns.visitor.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class Home
 * @Description 对象结构类
 * @Author rookie
 * @Date 2024/12/16 18:28
 * @Version 1.0
 */
public class Home {
    //声明一个集合对象，用来存储元素对象
    private List<Animal> nodeList = new ArrayList<>();

    //添加元素
    public void add(Animal animal){
        nodeList.add(animal);
    }

    public void action(Person person){
        //遍历集合，获取每一个元素，让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
