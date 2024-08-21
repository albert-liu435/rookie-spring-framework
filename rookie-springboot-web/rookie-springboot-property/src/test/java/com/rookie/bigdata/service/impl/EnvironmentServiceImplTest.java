package com.rookie.bigdata.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class EnvironmentServiceImplTest
 * @Description
 * @Author rookie
 * @Date 2024/8/20 15:36
 * @Version 1.0
 */
@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles("dev")
@Slf4j
class EnvironmentServiceImplTest {

    @Autowired
    private Environment environment;

    @Test
    void testEnvironment(){

//        environment.getActiveProfiles()

        String aValue=environment.getProperty("com.rookie.bigdata.a");
        log.info("获取的value为:{}",aValue);

    }

    @Test
    void testSpringConfigName(){

        String springConfigName = environment.getProperty("com.rookie.bigdata.spring.config.name");
        log.info("获取的springConfigName为:{}",springConfigName);
    }



    @Test
    void testSpringConfigLocation(){
        String locationValue=environment.getProperty("com.rookie.bigdata.spring.config.location");
        log.info("获取的locationValue为:{}",locationValue);
        String devValue=environment.getProperty("application.yml.dev");
        log.info("获取的devValue为:{}",devValue);

    }

    @Test
    void testSpringConfigAdditionalLocation(){
        String locationValue=environment.getProperty("com.rookie.bigdata.spring.config.location");
        log.info("获取的locationValue为:{}",locationValue);
        String devValue=environment.getProperty("application.yml.dev");
        log.info("获取的devValue为:{}",devValue);

    }

}
