package com.rookie.bigdata.springframework.context.messagesource.i18n;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.test.context.ActiveProfiles;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class SpringBootResourceBundleTest
 * @Description
 * @Author rookie
 * @Date 2024/8/26 14:45
 * @Version 1.0
 */
@SpringBootTest
//@AutoConfigureMockMvc
@ActiveProfiles("dev")
@Slf4j
class SpringBootResourceBundleTest {
    @Autowired
    private MessageSource messageSource;

    @Test
    public void testI18n() {


        log.info("[zh-CN] 10000.msg is {}.", messageSource.getMessage("10000",null, Locale.CHINA));
        log.info("[en-US] 10000.msg is {}.", messageSource.getMessage("10000",null, Locale.US));
    }

}
