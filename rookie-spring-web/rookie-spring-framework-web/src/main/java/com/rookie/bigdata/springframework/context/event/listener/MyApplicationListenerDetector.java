package com.rookie.bigdata.springframework.context.event.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Class MyApplicationListenerDetector
 * @Description
 * @Author rookie
 * @Date 2024/8/26 11:18
 * @Version 1.0
 */
@Slf4j
@Component
public class MyApplicationListenerDetector implements DestructionAwareBeanPostProcessor, MergedBeanDefinitionPostProcessor {
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        log.info("执行方法: {}","postProcessBeforeDestruction");
    }

    @Override
    public boolean requiresDestruction(Object bean) {
        log.info("执行方法: {}","requiresDestruction");
        return true;
    }

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        log.info("执行方法: {}","postProcessMergedBeanDefinition");
    }

    @Override
    public void resetBeanDefinition(String beanName) {
        log.info("执行方法: {}","resetBeanDefinition");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("执行方法: {}","postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("执行方法: {}","postProcessAfterInitialization");
        return bean;
    }
}
