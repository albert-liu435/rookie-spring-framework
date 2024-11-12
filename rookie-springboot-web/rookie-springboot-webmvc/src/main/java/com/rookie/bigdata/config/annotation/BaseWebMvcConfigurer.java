package com.rookie.bigdata.config.annotation;

import com.rookie.bigdata.springframework.web.method.support.MyArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @Class BaseWebMvcConfigurer
 * @Description
 * @Author rookie
 * @Date 2024/11/12 13:49
 * @Version 1.0
 */
@Configuration
public class BaseWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new MyArgumentResolver());
    }
}
