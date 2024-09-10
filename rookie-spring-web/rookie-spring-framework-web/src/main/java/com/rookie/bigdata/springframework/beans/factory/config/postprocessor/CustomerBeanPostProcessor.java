package com.rookie.bigdata.springframework.beans.factory.config.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Class CustomerBeanPostProcessor
 * @Description
 * @Author rookie
 * @Date 2024/9/10 9:41
 * @Version 1.0
 */
@Component
@Slf4j
public class CustomerBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("buildUser".equals(beanName)) {
            log.error("040执行BeanPostProcessor#postProcessBeforeInitialization");
        }


        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if ("buildUser".equals(beanName)) {
            log.error("045执行BeanPostProcessor#postProcessAfterInitialization");
        }

        return bean;
    }
}
