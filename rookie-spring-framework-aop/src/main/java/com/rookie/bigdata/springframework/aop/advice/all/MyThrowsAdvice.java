package com.rookie.bigdata.springframework.aop.advice.all;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.ThrowsAdvice;

/**
 * @Class MyThrowsAdvice
 * @Description
 * @Author rookie
 * @Date 2024/6/28 14:45
 * @Version 1.0
 */
@Slf4j
public class MyThrowsAdvice implements ThrowsAdvice {


    //根据异常类型的不同，进入不同的方法


    public void afterThrowing(Exception e){
        log.info("异常信息为："+e.getMessage());
        System.out.println("是否异常"+e.getMessage());
    }

    public void afterThrowing(RuntimeException e){
        log.info("异常信息为：");
        System.out.println("是否异常"+e.getMessage());
    }
}
