package com.rookie.bigdata.springframework.scheduling.annotation.asyncs.annotation;

import java.lang.annotation.*;

/**
 * @Class TestAnnotation
 * @Description
 * @Author rookie
 * @Date 2024/8/30 11:42
 * @Version 1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestAnnotation {
}
