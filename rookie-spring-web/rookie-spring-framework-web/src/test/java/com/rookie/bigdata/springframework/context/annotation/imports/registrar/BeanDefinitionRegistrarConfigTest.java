package com.rookie.bigdata.springframework.context.annotation.imports.registrar;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class BeanDefinitionRegistrarConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/9/6 14:04
 * @Version 1.0
 */
class BeanDefinitionRegistrarConfigTest {

    @Test
    void test01() {
        //加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanDefinitionRegistrarConfig.class);

        //获取成功注册到容器中的所有Bean的名称
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        //遍历Bean的名称
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }


    }

}
