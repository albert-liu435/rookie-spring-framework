package com.rookie.bigdata.springframework.context.lifecycle.anno;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/7 10:12
 * @Version 1.0
 */
@Slf4j
@Component
public class CustomerBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        if ("userLifeCycle".equals(beanName)) {
//            System.out.println("8. 调用 BeanPostProcessor.postProcessBeforeInitialization() 方法");
        log.error("8. 调用 BeanPostProcessor.postProcessBeforeInitialization() 方法");
//        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        if ("userLifeCycle".equals(beanName)) {
//            System.out.println("11. 调用 BeanPostProcessor.postProcessAfterInitialization() 方法");
        log.error("11. 调用 BeanPostProcessor.postProcessAfterInitialization() 方法");
//        }
        return bean;
    }
}
