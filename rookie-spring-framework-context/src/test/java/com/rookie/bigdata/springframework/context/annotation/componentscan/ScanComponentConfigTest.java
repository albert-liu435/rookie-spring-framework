package com.rookie.bigdata.springframework.context.annotation.componentscan;

import com.rookie.bigdata.springframework.context.annotation.configuration.MyConfig;
import com.rookie.bigdata.springframework.context.lifecycle.HelloBeanA;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ScanComponentConfigTest
 * @Description https://blog.csdn.net/qq_39017153/article/details/132160902
 * https://blog.csdn.net/qq_36602071/article/details/129418212
 * @Author rookie
 * @Date 2024/7/1 17:21
 * @Version 1.0
 */
@Slf4j
class ScanComponentConfigTest {


    @Test
    void test01() {
        //加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ScanComponentConfig.class);

        //获取成功注册到容器中的所有Bean的名称
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        //遍历Bean的名称
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
