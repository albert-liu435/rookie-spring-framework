package com.rookie.bigdata.springframework.beans.factory.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Class ValueService
 * @Description
 * @Author rookie
 * @Date 2024/8/21 9:52
 * @Version 1.0
 */
@Configuration
public class ValueService {


    @Value("${com.rookie.bigdata.beans.factory.annotation.value}")
    private String autoInject;

    @Value("${com.rookie.bigdata.beans.factory.annotation.exist:abc}")
    private String notExists;


    public String getAutoInject() {
        return autoInject;
    }

    public String getNotExists() {
        return notExists;
    }
}
