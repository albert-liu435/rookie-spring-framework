package com.rookie.bigdata.springframework.context.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Class MyBeanPostProcessor
 * @Description
 * @Author rookie
 * @Date 2024/8/21 16:22
 * @Version 1.0
 */
//@Component
@Slf4j
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userLifeCycle".equals(beanName)) {
//            System.out.println("8. 调用 BeanPostProcessor.postProcessBeforeInitialization() 方法");
            log.info("8. 调用 BeanPostProcessor.postProcessBeforeInitialization() 方法");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("userLifeCycle".equals(beanName)) {
//            System.out.println("11. 调用 BeanPostProcessor.postProcessAfterInitialization() 方法");
            log.info("11. 调用 BeanPostProcessor.postProcessAfterInitialization() 方法");
        }
        return bean;
    }
}
