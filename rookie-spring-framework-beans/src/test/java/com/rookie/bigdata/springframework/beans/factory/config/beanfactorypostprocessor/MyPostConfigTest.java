package com.rookie.bigdata.springframework.beans.factory.config.beanfactorypostprocessor;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyPostConfigTest
 * @Description https://juejin.cn/post/7021434021468962823
 * @Author rookie
 * @Date 2024/7/1 14:17
 * @Version 1.0
 */
class MyPostConfigTest {


    @Test
    void test01(){
        //加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyPostConfig.class);

        //获取成功注册到容器中的所有Bean的名称
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        //遍历Bean的名称
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
