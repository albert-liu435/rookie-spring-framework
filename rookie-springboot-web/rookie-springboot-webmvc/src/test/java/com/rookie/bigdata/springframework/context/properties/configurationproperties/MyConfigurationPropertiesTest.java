package com.rookie.bigdata.springframework.context.properties.configurationproperties;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/21 9:08
 * @Version 1.0
 */
@SpringBootTest
//@AutoConfigureMockMvc
@ActiveProfiles("dev")
@Slf4j
class MyConfigurationPropertiesTest {

    @Autowired
    private MyConfigurationProperties myConfigurationProperties;

    @Test
    void test01(){
        log.info("获取到的值:{},{},{}",myConfigurationProperties.getName(),myConfigurationProperties.isEnabled(),myConfigurationProperties.getSecurity().getUsername());
    }

}