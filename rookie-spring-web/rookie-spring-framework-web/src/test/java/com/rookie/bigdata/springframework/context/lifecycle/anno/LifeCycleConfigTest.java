package com.rookie.bigdata.springframework.context.lifecycle.anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/7 10:01
 * @Version 1.0
 */
class LifeCycleConfigTest {


    @Test
    void test01() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(LifeCycleConfig.class);

        annotationConfigApplicationContext.close();
    }

}