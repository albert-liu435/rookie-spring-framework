package com.rookie.bigdata.designpatterns.proxy.one.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Class DefineProxyTwo
 * @Description 动态代理类，通过实现接口
 * @Author rookie
 * @Date 2024/12/19 10:59
 * @Version 1.0
 */
public class DefineProxyTwo implements InvocationHandler {
    private Object target;
    public DefineProxyTwo(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        perName(method.getName());
        Object res = method.invoke(target,args);
        postName(method.getName());
        return res;
    }

    /**
     * 前置方法
     * @param name
     */
    private void perName(String name){
        System.out.println(name+"方法-前置执行");
    }
    /**
     * 后置方法
     * @param name
     */
    private void postName(String name){
        System.out.println(name+"方法-后置执行");
    }
}
