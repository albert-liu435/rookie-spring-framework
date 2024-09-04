package com.rookie.bigdata.springframework.context.aware;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Class AwareAnnoConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/9/4 11:25
 * @Version 1.0
 */
@Slf4j
class AwareAnnoConfigTest {

    @Test
    void test01() {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareAnnoConfig.class);
        AwareAnnoConfig config = context.getBean(AwareAnnoConfig.class);

//        Monkey monkey1 = config.monkey();
//        Monkey monkey2 = config.monkey();

//        @Configuration(proxyBeanMethods = false)  输出结果为false
//        @Configuration(proxyBeanMethods = true)  输出结果为true

        //不加@Configuration注解  输出结果为false
//        log.error("monkey1 是否等于 monkey2 ===>> {}", (monkey1 == monkey2));


    }
}


