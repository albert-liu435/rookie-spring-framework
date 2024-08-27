package com.rookie.bigdata.springframework.aop.advice.all;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Class MyRoundAdvice
 * @Description 环绕通知
 * @Author rookie
 * @Date 2024/6/28 13:45
 * @Version 1.0
 */
@Slf4j
public class MyRoundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("====round before====");
        Object result = invocation.proceed();
        log.info("====round after====");
        return result;

    }
}
