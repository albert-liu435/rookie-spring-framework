package com.rookie.bigdata.springframework.beans.factory.config.postprocessor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Class User
 * @Description
 * @Author rookie
 * @Date 2024/9/5 10:50
 * @Version 1.0
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Slf4j
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String name;

    public User() {
    }

    public User(String name) {
        log.error("022执行构造User对象");
        this.name = name;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

        log.error("执行BeanClassLoaderAware中的setBeanClassLoader");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.error("执行BeanFactoryAware中的setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        log.error("执行BeanNameAware中的setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        log.error("执行DisposableBean中的destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.error("执行InitializingBean中的afterPropertiesSet");
    }
}
