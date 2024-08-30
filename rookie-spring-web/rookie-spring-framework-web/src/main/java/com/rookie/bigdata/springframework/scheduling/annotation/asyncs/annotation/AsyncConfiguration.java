package com.rookie.bigdata.springframework.scheduling.annotation.asyncs.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Class AsyncConfiguration
 * @Description
 * @Author rookie
 * @Date 2024/8/30 11:42
 * @Version 1.0
 */
@EnableAsync(annotation = TestAnnotation.class)
@ComponentScan(basePackages = "com.rookie.bigdata.springframework.scheduling.annotation.asyncs.annotation")
public class AsyncConfiguration {
}
