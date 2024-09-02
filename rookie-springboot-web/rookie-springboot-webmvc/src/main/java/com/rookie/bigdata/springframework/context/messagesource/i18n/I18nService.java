package com.rookie.bigdata.springframework.context.messagesource.i18n;

import java.util.Locale;
import java.util.Map;

/**
 * @Class I18nService
 * @Description
 * @Author rookie
 * @Date 2024/9/2 16:49
 * @Version 1.0
 */
public interface I18nService {

    /**
     * 获取指定语言所有国际化信息
     * @param locale
     * @return
     */
    Map<String, String> getAllMessages(Locale locale);
}
