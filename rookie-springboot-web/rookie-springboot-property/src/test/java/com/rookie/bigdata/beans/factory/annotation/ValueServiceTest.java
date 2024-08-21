package com.rookie.bigdata.beans.factory.annotation;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Class ValueServiceTest
 * @Description
 * @Author rookie
 * @Date 2024/8/21 9:55
 * @Version 1.0
 */
@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles("dev")
@Slf4j
class ValueServiceTest {

    @Autowired
    private ValueService valueService;


    @Test
    void testValue(){


        String autoInject = valueService.getAutoInject();
        log.info("autoInject: {}",autoInject);
        String notExists = valueService.getNotExists();
        log.info("notExists: {}",notExists);
    }

}
