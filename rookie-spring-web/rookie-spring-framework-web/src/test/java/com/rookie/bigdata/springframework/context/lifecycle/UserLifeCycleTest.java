package com.rookie.bigdata.springframework.context.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class UserLifeCycleTest
 * @Description
 * @Author rookie
 * @Date 2024/8/21 16:11
 * @Version 1.0
 */
@Slf4j
class UserLifeCycleTest {

    @Test
    void test01() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springframework/context/lifecycle/lifecycle-spring.xml");
        final String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(beanDefinitionName -> log.info("name contains {}.", beanDefinitionName));

        UserLifeCycle userLifeCycle = (UserLifeCycle) context.getBean("userLifeCycle");
        log.info("UserLifeCycle: {}", userLifeCycle);
    }

}
