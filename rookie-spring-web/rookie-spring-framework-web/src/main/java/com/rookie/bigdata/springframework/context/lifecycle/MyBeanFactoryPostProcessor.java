package com.rookie.bigdata.springframework.context.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Class MyBeanFactoryPostProcessor
 * @Description
 * @Author rookie
 * @Date 2024/8/21 16:23
 * @Version 1.0
 */
//@Component
    @Slf4j
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        System.out.println("0. 调用 BeanFactoryPostProcessor.postProcessBeanFactory() 方法");
        log.error("0. 调用 BeanFactoryPostProcessor.postProcessBeanFactory() 方法");
    }
}
