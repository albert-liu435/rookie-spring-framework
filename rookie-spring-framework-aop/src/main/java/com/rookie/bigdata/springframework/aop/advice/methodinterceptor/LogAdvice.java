package com.rookie.bigdata.springframework.aop.advice.methodinterceptor;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Class LogAdvice
 * @Description
 * @Author rookie
 * @Date 2024/6/28 16:04
 * @Version 1.0
 */

@Slf4j
public class LogAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("before intercept exec");
        invocation.proceed();
        log.info("after intercept exec");
        return null;
    }
}
