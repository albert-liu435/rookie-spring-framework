package com.rookie.bigdata.springframework.context.annotation.imports.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Class BeanConfig
 * @Description
 * @Author rookie
 * @Date 2024/9/6 11:55
 * @Version 1.0
 */
//调用ConfigurationClassParser#getImports
@Import({Person.class, User.class})
@Configuration
public class BeanConfig {
}
