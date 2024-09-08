package com.rookie.bigdata.springframework.context.lifecycle.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/7 10:01
 * @Version 1.0
 */
@ComponentScan(value = {"com.rookie.bigdata.springframework.context.lifecycle.anno"})
@Configuration
public class LifeCycleConfig {


    @Bean
    StudentLifecycle studentLifecycle(){
        return new StudentLifecycle();
    }
}
