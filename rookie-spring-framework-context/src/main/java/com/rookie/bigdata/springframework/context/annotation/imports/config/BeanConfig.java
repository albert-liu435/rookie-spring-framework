package com.rookie.bigdata.springframework.context.annotation.imports.config;


import com.rookie.bigdata.springframework.context.annotation.imports.bean.Person;
import com.rookie.bigdata.springframework.context.annotation.imports.bean.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Class BeanConfig
 * @Description
 * @Author rookie
 * @Date 2024/6/27 18:00
 * @Version 1.0
 */

//调用ConfigurationClassParser#getImports
@Import({Person.class, User.class})
@Configuration
public class BeanConfig {
}
