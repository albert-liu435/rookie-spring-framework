package com.rookie.bigdata.springframework.context.lifecycle.anno;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/7 10:03
 * @Version 1.0
 */

@Data
@Slf4j
public class StudentLifecycle implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {




    private int id;

    private String name;

    public StudentLifecycle() {
    }

    public StudentLifecycle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        log.error("5. ClassLoader：{}", classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.error("5. BeanFactory：{}", beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        log.error("5. name：{}", name);
    }

    @Override
    public void destroy() throws Exception {
        log.error("5. destroy：{}", "destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.error("5. afterPropertiesSet：{}", "afterPropertiesSet");
    }
}
