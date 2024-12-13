package com.rookie.bigdata.designpatterns.factory.method;

/**
 * @Class Rectangle
 * @Description 矩形
 * @Author rookie
 * @Date 2024/12/13 16:43
 * @Version 1.0
 */
public class Rectangle implements Graphical {
    @Override
    public void description() {
        System.out.println("rectangle");
    }
}
