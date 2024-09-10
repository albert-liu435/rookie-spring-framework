package com.rookie.bigdata.springframework.beans.factory.config.postprocessor;

import com.rookie.bigdata.springframework.beans.factory.annotation.autowire.AutowiredConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.junit.jupiter.api.Test;

/**
 * @Class PostProcessorConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/9/10 9:22
 * @Version 1.0
 */
class PostProcessorConfigTest {


    @Test
    void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PostProcessorConfig.class);
    }

}
