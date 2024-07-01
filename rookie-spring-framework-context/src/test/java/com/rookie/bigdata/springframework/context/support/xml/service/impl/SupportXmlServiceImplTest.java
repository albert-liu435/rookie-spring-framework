package com.rookie.bigdata.springframework.context.support.xml.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


/**
 * @Class SupportXmlServiceImplTest
 * @Description
 * @Author rookie
 * @Date 2024/6/28 17:43
 * @Version 1.0
 */
@Slf4j
class SupportXmlServiceImplTest {



    @Test
    void test01(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springframework/context/support/supportxmlservice-spring.xml");
        final String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(beanDefinitionName -> log.info("name contains {}.", beanDefinitionName));
    }

}
