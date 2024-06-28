package com.rookie.bigdata.springframework.context.annotation.imports.registrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Class BeanDefinitionRegistrarConfig
 * @Description
 * @Author rookie
 * @Date 2024/6/28 11:08
 * @Version 1.0
 */
@Import({MyImportBeanDefinitionRegistrar.class})
@Configuration
public class BeanDefinitionRegistrarConfig {
}
