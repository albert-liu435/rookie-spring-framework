package com.rookie.bigdata.springframework.aop.advice.all.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Class LogInvocationHandler
 * @Description
 * @Author rookie
 * @Date 2024/8/27 14:17
 * @Version 1.0
 */
public class LogInvocationHandler implements InvocationHandler {
    Object target;  // 被代理的对象，实际的方法执行者

    public LogInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);  // 调用 target 的 method 方法
        after();
        return result;  // 返回方法的执行结果
    }

    // 调用invoke方法之前执行
    private void before() {
        System.out.println(String.format("log start time [%s] ", new Date()));
    }

    // 调用invoke方法之后执行
    private void after() {
        System.out.println(String.format("log end time [%s] ", new Date()));
    }
}
