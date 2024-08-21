package com.rookie.bigdata.springframework.context.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Class ConfigurationAnnotationConfig
 * @Description
 * @Author rookie
 * @Date 2024/8/21 14:11
 * @Version 1.0
 */
//@Configuration(proxyBeanMethods = true)

//@Configuration(proxyBeanMethods = false)
@Configuration
public class ConfigurationAnnotationConfig {
    @Bean
    public Monkey monkey() {
        return new Monkey();
    }
}
