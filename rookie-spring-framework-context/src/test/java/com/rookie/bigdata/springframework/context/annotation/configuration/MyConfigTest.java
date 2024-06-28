package com.rookie.bigdata.springframework.context.annotation.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Class MyConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/6/28 10:17
 * @Version 1.0
 */
class MyConfigTest {

    @Test
    void createBeanMyConfig() {
        //加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        //获取成功注册到容器中的所有Bean的名称
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        //遍历Bean的名称
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
