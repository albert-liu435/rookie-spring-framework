package com.rookie.bigdata.springframework.stereotype.component;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ComponentConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/6/28 9:24
 * @Version 1.0
 */
class ComponentConfigTest {


    @Test
    void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> System.out.println(definitionName));
    }

}
