package com.rookie.bigdata.springframework.context.messagesource.i18n;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.nio.charset.Charset;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class SpringResourceBundleTest
 * @Description
 * @Author rookie
 * @Date 2024/8/26 14:39
 * @Version 1.0
 */
@Slf4j
class SpringResourceBundleTest {

    @Test
    void test01(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springframework/context/messagesource/message-spring.xml");
        MessageSource messageSource = (MessageSource) context.getBean("myResource");

        log.info("[zh-CN] 10000.msg is {}.", messageSource.getMessage("10000", null, Locale.CHINA));
        log.info("[en-US] 10000.msg is {}.", messageSource.getMessage("10000", null, Locale.US));
    }


    @Test
    public void testI18n() {
        MessageSource messageSource = buildMessageSource();
        log.info("[zh-CN] 10000.msg is {}.", messageSource.getMessage("10000", null, Locale.CHINA));
        log.info("[en-US] 10000.msg is {}.", messageSource.getMessage("10000", null, Locale.US));
    }




    private MessageSource buildMessageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("i18n/messages");
        messageSource.setDefaultEncoding(Charset.forName("UTF-8").name());
        messageSource.setFallbackToSystemLocale(true);
        messageSource.setCacheSeconds(-1);
        messageSource.setAlwaysUseMessageFormat(false);
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }

}
