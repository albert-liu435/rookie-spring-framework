package com.rookie.bigdata.springframework.boot.context.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class CustomerConfigDataLoaderTest
 * @Description
 * @Author rookie
 * @Date 2024/9/11 15:58
 * @Version 1.0
 */
@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles("dev")
@ActiveProfiles("uat")
@Slf4j
class CustomerConfigDataLoaderTest {


    @Autowired
    private Environment environment;

    @Test
    void testApplication() {
        //        @ActiveProfiles("dev")
        String txtValue = environment.getProperty("com.rookie.bigdata.spring.config.import");
        log.info("获取的value为:{}", txtValue);
    }


    @Test
    void testSpringConfigName() {
        //需要使用默认的激活文件，不需要@ActiveProfiles注解


        String configname = environment.getProperty("com.rookie.bigdata.spring.config.name");
        log.info("获取的configname为:{}", configname);

        String configImport = environment.getProperty("com.rookie.bigdata.spring.config.import");
        log.info("获取的configImport为:{}", configImport);

    }


    @Test
    void testSpringConfigImport() {
//        @ActiveProfiles("dev")
        String txtValue = environment.getProperty("com.rookie.bigdata.spring.config.import");
        log.info("获取的value为:{}", txtValue);

        String appDev = environment.getProperty("com.rookie.bigdata.spring.application.dev");
        log.info("获取的appDev为:{}", appDev);
    }

    @Test
    void testSpringConfigImportCdl() {
//        @ActiveProfiles("uat")
        String txtValue = environment.getProperty("cdl");
        log.info("获取的value为:{}", txtValue);

//        String appDev = environment.getProperty("com.rookie.bigdata.spring.application.dev");
//        log.info("获取的appDev为:{}", appDev);
    }


}
