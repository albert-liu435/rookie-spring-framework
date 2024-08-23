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
public class UserLifeCycle implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean {


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
        log.error("5. BeanNameAware：{}", name);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        log.error("6. BeanClassLoaderAware:{}", classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.error("7. BeanFactoryAware:{}", beanFactory);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.error("9. InitializingBean:afterPropertiesSet");
    }

    public void myInit() {
        log.error("10. 调用myInit()，将maxSpeed设置为240。");

    }

    public void myDestory() {
        log.error("调用myDestroy()。");
    }


    @Override
    public void destroy() throws Exception {
        log.error("调用DisposableBean#destroy()");
    }
}
