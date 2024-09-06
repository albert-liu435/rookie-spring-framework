package com.rookie.bigdata.springframework.context.annotation.importaware.annotation;

import com.rookie.bigdata.springframework.context.annotation.importaware.config.MyImportAware;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Class EnableXcs
 * @Description
 * @Author rookie
 * @Date 2024/7/9 9:28
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MyImportAware.class)
public @interface EnableXcs {
}
