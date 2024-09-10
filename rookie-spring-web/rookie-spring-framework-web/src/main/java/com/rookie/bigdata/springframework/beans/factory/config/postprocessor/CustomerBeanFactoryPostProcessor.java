package com.rookie.bigdata.springframework.beans.factory.config.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/4 22:35
 * @Version 1.0
 */
@Component
@Slf4j
public class CustomerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        log.error("010执行BeanFactoryPostProcessor");
    }
}
