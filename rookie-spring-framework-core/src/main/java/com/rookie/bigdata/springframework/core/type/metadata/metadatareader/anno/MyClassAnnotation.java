package com.rookie.bigdata.springframework.core.type.metadata.metadatareader.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Class MyClassAnnotation
 * @Description
 * @Author rookie
 * @Date 2024/7/9 10:13
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyClassAnnotation {
    String value() default "";
}
