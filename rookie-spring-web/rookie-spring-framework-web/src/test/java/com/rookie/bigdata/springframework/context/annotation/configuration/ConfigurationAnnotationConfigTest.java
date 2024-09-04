package com.rookie.bigdata.springframework.context.annotation.configuration;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ConfigurationAnnotationConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/8/21 14:12
 * @Version 1.0
 */
@Slf4j
class ConfigurationAnnotationConfigTest {


    @Test
    void testContainer() {

        //容器执行流程
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigurationAnnotationConfig.class);
        ConfigurationAnnotationConfig config = context.getBean(ConfigurationAnnotationConfig.class);
    }


    @Test
    void testSupplier(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAnnotationConfig.class);
        // 定义一个BeanDefinition
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        // Bean由HashMap::new创建
        beanDefinition.setInstanceSupplier(HashMap::new);
        // 注册
        context.registerBeanDefinition("map", beanDefinition);
        System.out.println(context.getBean("map"));
    }




    @Test
    void monkey() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigurationAnnotationConfig.class);
        ConfigurationAnnotationConfig config = context.getBean(ConfigurationAnnotationConfig.class);
        Monkey monkey1 = config.monkey();
        Monkey monkey2 = config.monkey();

//        @Configuration(proxyBeanMethods = false)  输出结果为false
//        @Configuration(proxyBeanMethods = true)  输出结果为true

        //不加@Configuration注解  输出结果为false
        log.error("monkey1 是否等于 monkey2 ===>> {}", (monkey1 == monkey2));



    }
}
