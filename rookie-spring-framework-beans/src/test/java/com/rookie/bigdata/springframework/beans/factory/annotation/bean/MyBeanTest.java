package com.rookie.bigdata.springframework.beans.factory.annotation.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Class MyBeanTest
 * @Description
 * @Author rookie
 * @Date 2024/7/11 11:39
 * @Version 1.0
 */
class MyBeanTest {

    @Test
    void getMessage() {
        //创建BeanFactory
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(MyBean.class).getBeanFactory();

        //根据名称获取bean
        Object bean = beanFactory.getBean("myBean");
        System.out.println("通过名称获取Bean: " + bean);

    }
}
