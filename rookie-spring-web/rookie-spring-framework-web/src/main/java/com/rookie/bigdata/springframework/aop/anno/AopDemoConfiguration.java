package com.rookie.bigdata.springframework.aop.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Class AopDemoConfiguration
 * @Description
 * @Author rookie
 * @Date 2024/6/28 16:10
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.rookie.bigdata.springframework.aop.anno.compon")
@EnableAspectJAutoProxy
public class AopDemoConfiguration {
}
