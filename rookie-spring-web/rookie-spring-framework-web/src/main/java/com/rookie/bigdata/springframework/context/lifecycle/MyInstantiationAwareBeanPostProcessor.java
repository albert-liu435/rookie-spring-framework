package com.rookie.bigdata.springframework.context.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @Class MyInstantiationAwareBeanPostProcessor
 * @Description
 * @Author rookie
 * @Date 2024/8/21 16:19
 * @Version 1.0
 */
//@Component
@Slf4j
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("userLifeCycle".equals(beanName)) {
//            System.out.println("1. 调用 InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation() 方法");
            log.error("1. 调用 InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation() 方法");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("userLifeCycle".equals(beanName)) {
            UserLifeCycle userBean = (UserLifeCycle) bean;
//            System.out.println("3. 调用 InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation() 方法");
//            System.out.println(userBean);
            log.error("3. 调用 InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation() 方法");
            log.error(userBean.toString());
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if ("userLifeCycle".equals(beanName)) {
//            System.out.println("4. 调用 InstantiationAwareBeanPostProcessor.postProcessProperties() 方法");
            log.error("4. 调用 InstantiationAwareBeanPostProcessor.postProcessProperties() 方法");
        }
        return null;
    }
}
