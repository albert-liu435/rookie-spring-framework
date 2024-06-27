package com.rookie.bigdta.context.annotation.imports.config;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class BeanConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/6/27 18:01
 * @Version 1.0
 */
class BeanConfigTest {

//        public static void main(String[] args) {

    @Test
    void test01() {
        //加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        //获取成功注册到容器中的所有Bean的名称
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        //遍历Bean的名称
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }


    }


}
