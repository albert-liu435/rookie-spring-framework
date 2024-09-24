package com.rookie.bigdata.springframework.beans.factory.annotation.value;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

/**
 * @Class ValueDemoConfig
 * @Description
 * @Author rookie
 * @Date 2024/9/24 9:21
 * @Version 1.0
 */
@ToString
@Configuration
@ComponentScan(value = {"com.rookie.bigdata.springframework.beans.factory.annotation.value"})
@PropertySource(value = {"classpath:valueDemo.properties"})
public class ValueDemoConfig {


    /**
     * 注入普通字符串
     */
    @Value("Test Value String")
    private String testString;

    /**
     * 注入工程根目录
     */
    @Value("#{systemProperties['user.dir']}")
    private String userDir;

    /**
     * 注入表达式的结果
     */
    @Value("#{ T(java.lang.Math).random() * 10.0 }")
    private double randomValue;

    /**
     * 注入其他Bean的属性
     */
    @Value("#{valueDemo.valueName}")
    private String valueDemoName;

    /**
     * 注入配置文件中的值
     */
    @Value("${valueDemoString}")
    private String vvalueDemoString;

    /**
     * 注入文件资源
     */
    @Value("classpath:valueDemo.properties")
    private Resource resourceFile;

    /**
     * 注入URL资源
     */
    @Value("https://www.sohu.com/")
    private Resource url;

}
