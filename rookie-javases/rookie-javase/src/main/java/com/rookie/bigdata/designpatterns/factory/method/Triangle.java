package com.rookie.bigdata.designpatterns.factory.method;

/**
 * @Class Triangle
 * @Description 三角形
 * @Author rookie
 * @Date 2024/12/13 16:49
 * @Version 1.0
 */
public class Triangle implements Graphical {

    @Override
    public void description() {
        System.out.println("triangle");
    }
}

