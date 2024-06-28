package com.rookie.bigdata.springframework.context.annotation.imports.selectors;

import com.rookie.bigdata.springframework.context.annotation.imports.config.BeanConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ImportSelectorConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/6/28 10:58
 * @Version 1.0
 */
class ImportSelectorConfigTest {
    @Test
    void test01() {
        //加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportSelectorConfig.class);

        //获取成功注册到容器中的所有Bean的名称
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        //遍历Bean的名称
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }


    }
}
