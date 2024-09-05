package com.rookie.bigdata.springframework.beans.factory.config.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Class PostProcessorConfig
 * @Description
 * @Author rookie
 * @Date 2024/9/5 10:48
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.rookie.bigdata.springframework.beans.factory.config.postprocessor")
public class PostProcessorConfig {


    @Bean
    User buildUser(){
        return new User("zhangsan");
    }
}
