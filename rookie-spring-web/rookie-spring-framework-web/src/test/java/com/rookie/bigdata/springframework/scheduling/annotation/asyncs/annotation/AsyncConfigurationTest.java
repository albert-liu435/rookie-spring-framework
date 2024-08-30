package com.rookie.bigdata.springframework.scheduling.annotation.asyncs.annotation;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Class AsyncConfigurationTest
 * @Description
 * @Author rookie
 * @Date 2024/8/30 11:44
 * @Version 1.0
 */
@Slf4j
class AsyncConfigurationTest {
    @Test
    void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AsyncConfiguration.class);
        //用id取出业务逻辑类的bean
        HelloSyncService helloService = (HelloSyncService) applicationContext.getBean("helloSyncService");
        log.info("test begin...");
        helloService.print();
        log.info("test end!");
    }

}
