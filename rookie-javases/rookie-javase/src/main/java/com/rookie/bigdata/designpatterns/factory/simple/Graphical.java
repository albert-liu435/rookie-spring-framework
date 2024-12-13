package com.rookie.bigdata.designpatterns.factory.simple;

/**
 * @Class Graphical
 * @Description 抽象图形类
 * @Author rookie
 * @Date 2024/12/13 16:37
 * @Version 1.0
 */
public abstract class Graphical {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
