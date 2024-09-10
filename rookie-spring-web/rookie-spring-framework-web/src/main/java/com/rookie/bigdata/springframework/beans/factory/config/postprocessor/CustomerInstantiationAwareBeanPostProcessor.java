package com.rookie.bigdata.springframework.beans.factory.config.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Class CustomerInstantiationAwareBeanPostProcessor
 * @Description
 * @Author rookie
 * @Date 2024/9/10 9:31
 * @Version 1.0
 */
@Component
@Slf4j
public class CustomerInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if("buildUser".equals(beanName)){
            log.error("021执行InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation");
        }

        return null;
    }


    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if("buildUser".equals(beanName)){
            log.error("033执行InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation");
        }

        return true;
    }


    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if("buildUser".equals(beanName)){
            log.error("034执行InstantiationAwareBeanPostProcessor#postProcessProperties");
        }

        return pvs;
    }
}
