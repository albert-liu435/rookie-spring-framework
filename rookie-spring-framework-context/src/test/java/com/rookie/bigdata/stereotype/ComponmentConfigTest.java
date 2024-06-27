package com.rookie.bigdata.stereotype;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ComponmentConfigTest
 * @Description https://www.51cto.com/article/753931.html
 * @Author rookie
 * @Date 2024/6/27 14:57
 * @Version 1.0
 */
class ComponmentConfigTest {


    @Test
    void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> System.out.println(definitionName));
    }

}
