package com.rookie.bigdata.springframework.context.lifecycle.anno;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Class ConfigATest
 * @Description https://blog.csdn.net/Sheng_Q/article/details/128277673
 * @Author rookie
 * @Date 2024/7/1 10:13
 * @Version 1.0
 */
@Slf4j
class ConfigATest {


    @Test
    void createLocationA() {
        //加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigA.class);

        //获取成功注册到容器中的所有Bean的名称
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        //遍历Bean的名称
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
