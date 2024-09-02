package com.rookie.bigdata.springframework.config;

import com.rookie.bigdata.springframework.interceptor.MyHandlerInterceptor;
import com.rookie.bigdata.springframework.interceptor.MyRefererInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author rookie
 * @Description
 * @Date 2024/8/29 23:14
 * @Version 1.0
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    /**
     * 添加拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor());
        InterceptorRegistration addInterceptor = registry.addInterceptor(new MyRefererInterceptor());
        addInterceptor.excludePathPatterns("/hello");
        addInterceptor.addPathPatterns("/**");


    }
}
