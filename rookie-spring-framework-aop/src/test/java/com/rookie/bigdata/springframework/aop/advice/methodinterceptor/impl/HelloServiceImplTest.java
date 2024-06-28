package com.rookie.bigdata.springframework.aop.advice.methodinterceptor.impl;

import com.rookie.bigdata.springframework.aop.advice.methodinterceptor.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Class HelloServiceImplTest
 * @Description TODO
 * @Author rookie
 * @Date 2024/6/28 16:08
 * @Version 1.0
 */
class HelloServiceImplTest {

    @Test
    void run() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/aop/methodinterceptor/aop-spring.xml");

        HelloService runnerExecPc = (HelloService) ctx.getBean("helloService");
        runnerExecPc.run();

    }

}
