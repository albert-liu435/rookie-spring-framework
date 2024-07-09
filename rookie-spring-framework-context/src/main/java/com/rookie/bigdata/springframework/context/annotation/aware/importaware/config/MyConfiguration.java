package com.rookie.bigdata.springframework.context.annotation.aware.importaware.config;

import com.rookie.bigdata.springframework.context.annotation.aware.importaware.annotation.EnableXcs;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Class MyConfiguration
 * @Description
 * @Author rookie
 * @Date 2024/7/9 9:28
 * @Version 1.0
 */
@Configuration
//@Import(MyImportAware.class)
@EnableXcs
public class MyConfiguration {

}
