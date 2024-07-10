package com.rookie.bigdata.springframework.core.convert.converter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Class DateFormat
 * @Description
 * @Author rookie
 * @Date 2024/7/10 15:20
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DateFormat {
    String value();
}
