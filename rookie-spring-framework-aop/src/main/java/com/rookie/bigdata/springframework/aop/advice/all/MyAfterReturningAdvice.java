package com.rookie.bigdata.springframework.aop.advice.all;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Class MyAfterReturningAdvice
 * @Description 后置通知
 * @Author rookie
 * @Date 2024/6/28 13:44
 * @Version 1.0
 */
@Slf4j
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("------------after----------------");
    }
}
