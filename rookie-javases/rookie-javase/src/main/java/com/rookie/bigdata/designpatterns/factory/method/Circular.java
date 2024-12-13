package com.rookie.bigdata.designpatterns.factory.method;

/**
 * @Class Circular
 * @Description 圆形
 * @Author rookie
 * @Date 2024/12/13 16:44
 * @Version 1.0
 */
public class Circular implements Graphical {
    @Override
    public void description() {
        System.out.println("circular");
    }
}
