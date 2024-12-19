package com.rookie.bigdata.designpatterns.proxy.one.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Class DefineProxy
 * @Description 动态代理类
 * @Author rookie
 * @Date 2024/12/19 10:57
 * @Version 1.0
 */
public class DefineProxy {
    private Object target;
    public DefineProxy(Object target){
        this.target = target;
    }
    public Object createProxy(){
        return Proxy.newProxyInstance(DefineProxy.class.getClassLoader(), this.target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                perName(method.getName());
                Object invoke = method.invoke(target, args);
                postName(method.getName());
                return invoke;
            }
        });
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
