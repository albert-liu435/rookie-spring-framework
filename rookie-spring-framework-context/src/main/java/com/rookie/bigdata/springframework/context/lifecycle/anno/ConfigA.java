package com.rookie.bigdata.springframework.context.lifecycle.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Class ConfigA
 * @Description
 * @Author rookie
 * @Date 2024/7/1 10:04
 * @Version 1.0
 */

@Configuration
@ComponentScan("com.rookie.bigdata.springframework.context.lifecycle.anno")
public class ConfigA {


    @Bean
    public LocationA createLocationA(){
        return new LocationA(123L,22L);
    }
}
