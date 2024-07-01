package com.rookie.bigdata.springframework.beans.factory.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Class SpringAware
 * @Description
 * @Author rookie
 * @Date 2024/7/1 15:23
 * @Version 1.0
 */
@Slf4j
public class SpringAware implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("传入的IOC容器applicationContext = [" + applicationContext + "]");
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }


}
