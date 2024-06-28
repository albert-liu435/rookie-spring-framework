package com.rookie.bigdata.springframework.context.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Class MyConfig
 * @Description
 * @Author rookie
 * @Date 2024/6/28 10:15
 * @Version 1.0
 */
@Configuration
public class MyConfig {


    @Bean
    BeanMyConfig createBeanMyConfig() {
        return new BeanMyConfig();
    }

}
