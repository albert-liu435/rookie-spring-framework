package com.rookie.bigdata.springframework.beans.factory.config.beanfactorypostprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Class MyBeanFactoryPostProcessor
 * @Description
 * @Author rookie
 * @Date 2024/7/1 14:15
 * @Version 1.0
 */

@Component
@Slf4j
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        log.info("执行MyBeanFactoryPostProcessor");

    }
}
