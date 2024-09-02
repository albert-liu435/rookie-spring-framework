package com.rookie.bigdata.springframework.context.messagesource.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Class I18nServiceImpl
 * @Description
 * @Author rookie
 * @Date 2024/9/2 16:50
 * @Version 1.0
 */
@Service
public class I18nServiceImpl implements I18nService{

    @Autowired
    private MessageSource messageSource;

    @Override
    public Map<String, String> getAllMessages(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        //存放所有message
        Map<String, String> messages = new HashMap<>();

        ResourceBundleMessageSource bundleMessageSource = (ResourceBundleMessageSource) messageSource;
        String[] basenames = bundleMessageSource.getBasenameSet().toArray(new String[0]);

        for (String basename : basenames) {
            //从缓存中获取资源文件
            ResourceBundle resourceBundle = ResourceBundle.getBundle(basename, locale);
            //获取资源文件的所有code
            Set<String> keys = resourceBundle.keySet();

            for (String key : keys) {
                //根据code获取对应的message
                String message = messageSource.getMessage(key, null, locale);
                messages.put(key, message);
            }
        }
        return messages;
    }
}
