package com.rookie.bigdata.springframework;

import com.rookie.bigdata.springframework.config.RootConfig;
import com.rookie.bigdata.springframework.config.WebConfig;
import com.rookie.bigdata.springframework.filter.MyCorsFilter;
import jakarta.servlet.Filter;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @Author rookie
 * @Description
 * @Date 2024/8/29 23:18
 * @Version 1.0
 */
public class MyWebApplicationInitializer extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        //        applicationContext.setConfigLocation("com.git.hui.spring");
        applicationContext.register(RootConfig.class);
        applicationContext.register(WebConfig.class);

        System.out.println("-------------------");

        return applicationContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }


    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{new CharacterEncodingFilter("UTF-8", true), new MyCorsFilter()};
    }
}
