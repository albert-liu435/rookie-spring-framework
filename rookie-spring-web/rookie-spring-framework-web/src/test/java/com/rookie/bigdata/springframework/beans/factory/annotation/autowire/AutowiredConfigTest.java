package com.rookie.bigdata.springframework.beans.factory.annotation.autowire;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/6 20:49
 * @Version 1.0
 */
class AutowiredConfigTest {

    @Test
    void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AutowiredConfig.class);
//        User user = (User) applicationContext.getBean("user");
//        System.out.println(user);
//        SpringEnvironment springsEnvironment = (SpringEnvironment)applicationContext.getBean("springsEnvironment");
//        Environment environment = springsEnvironment.getEnvironment();
//
//        SpringAware springAware = (SpringAware) applicationContext.getBean("springAware");
//        ApplicationContext applicationContext1 = springAware.getApplicationContext();
//        User user = (User) applicationContext1.getBean("user");
//        System.out.println(user);
    }

}