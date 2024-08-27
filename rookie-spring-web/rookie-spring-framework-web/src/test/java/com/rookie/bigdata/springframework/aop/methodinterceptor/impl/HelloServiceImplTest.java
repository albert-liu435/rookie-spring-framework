package com.rookie.bigdata.springframework.aop.methodinterceptor.impl;

import com.rookie.bigdata.springframework.aop.methodinterceptor.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class HelloServiceImplTest
 * @Description
 * @Author rookie
 * @Date 2024/8/27 17:24
 * @Version 1.0
 */
class HelloServiceImplTest {

    @Test
    void run() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/springframework/aop/methodinterceptor/aop-spring.xml");

        HelloService runnerExecPc = (HelloService) ctx.getBean("helloService");
        runnerExecPc.run();
    }
}
