package com.rookie.bigdata.springframework.aop.anno.compon;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Class MyNormalAspect
 * @Description
 * @Author rookie
 * @Date 2024/6/28 16:13
 * @Version 1.0
 */
@Component
@Aspect
@Slf4j
public class MyNormalAspect {

    @Pointcut("execution(public String com.rookie.bigdata.springframework.aop.advice.anno.compon.DataTask.*(..))")
    public void webLog() {
    }


    @Before(value = "webLog()")
    public void beforeExec(JoinPoint joinPoint) {
        log.info("[Before DataTask], joinPoint is {}.", joinPoint);
    }

    @AfterReturning(value = "execution(public String com.rookie.bigdata.springframework.aop.advice.anno.compon.DataTask.*(..))")
    public void afterExec(JoinPoint joinPoint) {
        log.info("[After DataTask], result is {}, joinPoint is {}.", joinPoint);
    }


    /**
     * 环绕
     *
     * @param joinPoint
     */
    @SneakyThrows
    @Around("execution(public String com.rookie.bigdata.springframework.aop.advice.anno.compon.DataTask.*(..))")
    public void aroundExec(ProceedingJoinPoint joinPoint) {
        log.info("[Around DataTask] call before.");
        Object result = joinPoint.proceed();
        log.info("[Around DataTask] call end, result is {}.", result);
    }

    @AfterThrowing("execution(public String com.rookie.bigdata.springframework.aop.advice.anno.compon.DataTask.*(..))")
    public void afterThrowingExec(JoinPoint joinPoint) {
        log.info("[AfterThrow DataTask], joinPoint is {}.", joinPoint);
    }

}
