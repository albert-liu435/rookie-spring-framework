package com.rookie.bigdata.designpatterns.proxy.one.statics;

/**
 * @Class RealSubject
 * @Description 目标类
 * @Author rookie
 * @Date 2024/12/19 10:06
 * @Version 1.0
 */
public class RealSubject implements Subject{
    @Override
    public void info() {
        System.out.println("被代理对象方法执行。。。");
    }
}
