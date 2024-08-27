package com.rookie.bigdata.springframework.aop.xml.impl;

import com.rookie.bigdata.springframework.aop.xml.RunnerService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class RunnerServiceImplTest
 * @Description
 * @Author rookie
 * @Date 2024/8/27 17:20
 * @Version 1.0
 */
class RunnerServiceImplTest {

    @Test
    void run() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/springframework/aop/xml/aop-spring.xml");

        RunnerService runnerExecPc = (RunnerService) ctx.getBean("runnerService");
        runnerExecPc.run();
    }
}
