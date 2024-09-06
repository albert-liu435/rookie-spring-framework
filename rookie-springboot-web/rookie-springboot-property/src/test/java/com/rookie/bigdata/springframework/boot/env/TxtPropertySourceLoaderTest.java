package com.rookie.bigdata.springframework.boot.env;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class TxtPropertySourceLoaderTest
 * @Description
 * @Author rookie
 * @Date 2024/9/6 14:47
 * @Version 1.0
 */
@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles("dev")
@Slf4j
class TxtPropertySourceLoaderTest {

    @Autowired
    private Environment environment;

    @Test
    void getFileExtensions() {
    }

    @Test
    void load() {
        String txtValue=environment.getProperty("com.rookie.bigdata.txt");
        log.info("获取的value为:{}",txtValue);

    }
}
