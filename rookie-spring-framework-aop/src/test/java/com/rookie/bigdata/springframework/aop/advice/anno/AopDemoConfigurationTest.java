package com.rookie.bigdata.springframework.aop.advice.anno;

import com.rookie.bigdata.springframework.aop.advice.anno.compon.DataTask;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Class AopDemoConfigurationTest
 * @Description
 * @Author rookie
 * @Date 2024/6/28 16:12
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
