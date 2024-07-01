package com.rookie.bigdata.springframework.context.support.xml.instantiate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Class InstantiateUser
 * @Description
 * @Author rookie
 * @Date 2024/7/1 16:09
 * @Version 1.0
 */
@Slf4j
public class InstantiateUser implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean {

    private String username;
    private String address;

    public InstantiateUser() {
    }

    public InstantiateUser(String username, String address) {
        this.username = username;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void init() {
        System.out.println("执行初始化方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        log.info("BeanNameAware：{}",name);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        log.info("BeanClassLoaderAware:{}",classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("BeanFactoryAware:{}",beanFactory);
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
