package com.rookie.bigdata.springframework.context.annotation.configuration.proxybeanmethods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Class ConfigurationAnnotationConfig
 * @Description https://blog.csdn.net/qq_45721579/article/details/136235459
 * @Author rookie
 * @Date 2024/7/3 14:12
 * @Version 1.0
 */
//@Configuration(proxyBeanMethods = true)

//@Configuration(proxyBeanMethods = false)
public class ConfigurationAnnotationConfig {
    @Bean
    public Monkey monkey(){
        return new Monkey();
    }
}

