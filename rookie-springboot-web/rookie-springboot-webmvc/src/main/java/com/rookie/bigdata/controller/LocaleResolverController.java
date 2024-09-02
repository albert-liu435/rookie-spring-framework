package com.rookie.bigdata.controller;

import com.rookie.bigdata.springframework.context.messagesource.i18n.I18nService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.Map;

/**
 * @Class I18nController
 * @Description
 * @Author rookie
 * @Date 2024/9/2 16:51
 * @Version 1.0
 */
@RequestMapping("/i18n")
@RestController
public class LocaleResolverController {

    @Resource
    private I18nService i18nService;

    /**
     * localhost:8080/i18n/messages
     * 并且header中 添加 Accept-Language=en_US 或者 Accept-Language=zh_CN
     * @param locale
     * @return
     */
    @RequestMapping("/messages")
    public Map<String, String> getAllMessages(@RequestHeader(name = "Accept-Language" , required = false) Locale locale) {
        return i18nService.getAllMessages(locale);
    }
}
