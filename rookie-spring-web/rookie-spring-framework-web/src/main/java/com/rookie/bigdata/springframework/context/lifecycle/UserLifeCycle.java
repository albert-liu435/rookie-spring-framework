package com.rookie.bigdata.springframework.context.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Class UserLifeCycle
 * @Description https://segmentfault.com/a/1190000040365130#item-1 查看Spring的生命周期
 * @Author rookie
 * @Date 2024/8/21 16:10
 * @Version 1.0
 */
@Slf4j
public class UserLifeCycle implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean {


    private int id;

    private String name;

    public UserLifeCycle() {
    }

    public UserLifeCycle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "UserLifeCycle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        log.info("BeanNameAware：{}", name);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        log.info("BeanClassLoaderAware:{}", classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("BeanFactoryAware:{}", beanFactory);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("InitializingBean:afterPropertiesSet");
    }

    public void myInit() {
        log.info("调用myInit()，将maxSpeed设置为240。");

    }

    public void myDestory() {
        log.info("调用myDestroy()。");
    }


}
