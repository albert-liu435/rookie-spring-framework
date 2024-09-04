package com.rookie.bigdata.springframework.context.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Class CustomerApplicationContextAware
 * @Description
 * @Author rookie
 * @Date 2024/9/4 11:21
 * @Version 1.0
 */
@Slf4j
@Component
public class CustomerApplicationContextAware implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        log.info("ApplicationContextAware：{}",applicationContext);

        this.applicationContext = applicationContext;
    }
}
