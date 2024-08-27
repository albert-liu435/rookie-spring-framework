package com.rookie.bigdata.springframework.aop.anno;

import com.rookie.bigdata.springframework.aop.anno.compon.DataTask;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class AopDemoConfigurationTest
 * @Description TODO
 * @Author rookie
 * @Date 2024/8/27 17:27
 * @Version 1.0
 */
class AopDemoConfigurationTest {
    @Test
    void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopDemoConfiguration.class);
        DataTask dataTask = (DataTask) context.getBean("dataTask");
        dataTask.syncData();

    }
}
