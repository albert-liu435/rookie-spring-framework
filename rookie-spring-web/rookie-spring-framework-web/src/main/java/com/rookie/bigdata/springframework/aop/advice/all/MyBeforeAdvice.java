package com.rookie.bigdata.springframework.aop.advice.all;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Class MyBeforeAdvice
 * @Description 前置通知
 * @Author rookie
 * @Date 2024/6/28 13:42
 * @Version 1.0
 */
@Slf4j
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        log.info("------------before----------------");
    }
}
