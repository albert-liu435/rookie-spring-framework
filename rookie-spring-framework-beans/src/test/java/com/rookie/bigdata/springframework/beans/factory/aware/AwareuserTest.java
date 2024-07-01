package com.rookie.bigdata.springframework.beans.factory.aware;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class AwareuserTest
 * @Description
 * @Author rookie
 * @Date 2024/7/1 15:32
 * @Version 1.0
 */
class AwareuserTest {


    @Test
    void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/factory/aware/aware-spring.xml");
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
