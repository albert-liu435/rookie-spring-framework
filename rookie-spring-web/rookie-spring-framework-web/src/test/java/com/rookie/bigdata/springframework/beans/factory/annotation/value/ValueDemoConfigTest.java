package com.rookie.bigdata.springframework.beans.factory.annotation.value;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ValueDemoConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/9/24 9:23
 * @Version 1.0
 */
@Slf4j
class ValueDemoConfigTest {

    @Test
    void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValueDemoConfig.class);
        ValueDemoConfig valueConfig = context.getBean (ValueDemoConfig.class);
        log.info ("valueConfig:{}", valueConfig.toString ());

    }

}
