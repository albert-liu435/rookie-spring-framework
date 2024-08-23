package com.rookie.bigdata.springframework.context.lifecycle.inject;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


/**
 * @Class AddressTest
 * @Description
 * @Author rookie
 * @Date 2024/8/23 17:37
 * @Version 1.0
 */
@Slf4j
class AddressTest {

    @Test
    void test01() {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springframework/context/lifecycle/inject/inject-spring.xml");
        final String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(beanDefinitionName -> log.info("name contains {}.", beanDefinitionName));

        Address address = (Address) context.getBean("address");
        log.info("address: {}", address);

        context.close();


    }

}
