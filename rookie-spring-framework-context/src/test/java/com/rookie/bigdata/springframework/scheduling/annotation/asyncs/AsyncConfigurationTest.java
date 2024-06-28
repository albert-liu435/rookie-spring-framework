package com.rookie.bigdata.springframework.scheduling.annotation.asyncs;

import com.rookie.bigdata.springframework.scheduling.annotation.asyncs.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.Future;


/**
 * @Class AsyncConfigurationTest
 * @Description
 * @Author rookie
 * @Date 2024/6/28 11:30
 * @Version 1.0
 */
@Slf4j
class AsyncConfigurationTest {


    @Test
    void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AsyncConfiguration.class);
        //用id取出业务逻辑类的bean
        HelloService componentA = (HelloService) applicationContext.getBean("helloService");
        log.info("test begin...");
        componentA.print();
        log.info("test end!");
    }

    @Test
    void test02() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AsyncConfiguration.class);
        //用id取出业务逻辑类的bean
        HelloService componentA = (HelloService) applicationContext.getBean("helloService");
        log.info("test begin...");
        final Future<String> resultFuture = componentA.print2();
        doOtherBusiness();
        log.info("test end!");

        // 这一步执行时main线程会等待异步方法返回的结果
        log.info("result is {}", resultFuture.get());
    }


    private static void doOtherBusiness() {
        log.info("do other business...");
    }
}
