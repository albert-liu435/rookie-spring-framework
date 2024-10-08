package com.rookie.bigdata.springframework.context.annotation.importaware.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyConfigurationTest
 * @Description
 * @Author rookie
 * @Date 2024/9/6 14:11
 * @Version 1.0
 */
@Slf4j
class MyConfigurationTest {
    @Test
    void setImportMetadata() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        String customBean  = context.getBean(String.class);
        System.out.println(customBean);
        log.info("实例化Bean: {}",customBean);
    }

    @Test
    void customBean() {
    }
}
