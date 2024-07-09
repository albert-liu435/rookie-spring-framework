package com.rookie.bigdata.springframework.core.type.metadata.metadatareader.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Class MyAnnotation
 * @Description
 * @Author rookie
 * @Date 2024/7/9 10:12
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "";
}
