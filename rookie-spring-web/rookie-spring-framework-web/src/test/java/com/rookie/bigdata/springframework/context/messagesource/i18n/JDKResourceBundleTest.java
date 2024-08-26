package com.rookie.bigdata.springframework.context.messagesource.i18n;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.security.AccessController;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class JDKResourceBundleTest
 * @Description
 * @Author rookie
 * @Date 2024/8/26 14:31
 * @Version 1.0
 */
@Slf4j
class JDKResourceBundleTest {

    @Test
    public void testJavaI18n() {
        ResourceBundle cnBundle = ResourceBundle.getBundle("i18n/messages", Locale.CHINA);
        log.info("[CHINA] 10000.msg is {}.", cnBundle.getString("10000"));
        log.info("[CHINA] 10001.msg is {}.", cnBundle.getString("10001"));
        log.info("[CHINA] 10002.msg is {}.", cnBundle.getString("10002"));
        ResourceBundle usBundle = ResourceBundle.getBundle("i18n/messages", Locale.US);
        log.info("[US] 10000.msg is {}.", usBundle.getString("10000"));
        log.info("[US] 10001.msg is {}.", usBundle.getString("10001"));
        log.info("[US] 10002.msg is {}.", usBundle.getString("10002"));
    }



    @Test
    public void testCurrencyInstance() {
        log.info("[CN] result is {}", NumberFormat.getCurrencyInstance(Locale.CHINA).format(100.00));
        log.info("[US] result is {}", NumberFormat.getCurrencyInstance(Locale.US).format(100.00));
        log.info("[default] result is {}", NumberFormat.getCurrencyInstance().format(100.00));
    }

    @Test
    public void testDateInstance() {
        Date date = new Date();
        log.info("[CN] result is {}", DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.CHINA).format(date));
        log.info("[US] result is {}", DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US).format(date));
        log.info("[default] result is {}", DateFormat.getDateInstance(DateFormat.DEFAULT).format(date));
    }

    @Test
    public void testTimeInstance() {
        Date date = new Date();
        log.info("[CN] result is {}", DateFormat.getTimeInstance(DateFormat.DEFAULT, Locale.CHINA).format(date));
        log.info("[US] result is {}", DateFormat.getTimeInstance(DateFormat.DEFAULT, Locale.US).format(date));
        log.info("[default] result is {}", DateFormat.getTimeInstance(DateFormat.DEFAULT).format(date));
    }

    @Test
    public void testDefaultLocal() {
//        String language = AccessController.doPrivileged(new GetPropertyAction("user.language", "en"));
//        log.info("Default language is {}.", language);
//
//        String country = AccessController.doPrivileged(new GetPropertyAction("user.country", ""));
//        log.info("Default country is {}.", country);
//
//        String region = AccessController.doPrivileged(new GetPropertyAction("user.region"));
//        log.info("Default region is {}.", region);
    }




}
