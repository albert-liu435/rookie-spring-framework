package com.rookie.bigdata.springframework.beans.factory.config.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Class CustomerMergedBeanDefinitionPostProcessor
 * @Description
 * @Author rookie
 * @Date 2024/9/10 9:49
 * @Version 1.0
 */
@Slf4j
@Component
public class CustomerMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {

        if("buildUser".equals(beanName)){
            log.error("012执行MergedBeanDefinitionPostProcessor#postProcessMergedBeanDefinition");

        }

    }
}
