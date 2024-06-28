package com.rookie.bigdata.springframework.aop.advice.xml.impl;

import com.rookie.bigdata.springframework.aop.advice.xml.RunnerService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ApplicationRunnerServiceImplTest
 * @Description https://blog.csdn.net/Sheng_Q/article/details/128277784
 * @Author rookie
 * @Date 2024/6/28 15:50
 * @Version 1.0
 */
class ApplicationRunnerServiceImplTest {

    @Test
    void run() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/aop/aop-spring.xml");

        RunnerService runnerExecPc = (RunnerService) ctx.getBean("runnerService");
        runnerExecPc.run();

    }
}
