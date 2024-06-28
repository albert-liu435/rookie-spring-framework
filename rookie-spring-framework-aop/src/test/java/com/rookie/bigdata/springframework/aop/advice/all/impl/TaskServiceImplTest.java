package com.rookie.bigdata.springframework.aop.advice.all.impl;

import com.rookie.bigdata.springframework.aop.advice.all.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;


/**
 * @Class TaskServiceImplTest
 * @Description
 * @Author rookie
 * @Date 2024/6/28 13:52
 * @Version 1.0
 */
@Slf4j
class TaskServiceImplTest {


    //试用例中为ProxyFactory添加切面部分逻辑为：proxyFactory.addAdvice(new MyBeforeAdvice()); 等价于 proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new MyBeforeAdvice()));.

    @Test
    void sync1() {

        log.debug("开始");
        ProxyFactory proxyFactory = new ProxyFactory();
        TaskService taskService = new TaskServiceImpl();
        proxyFactory.setTarget(taskService);
        proxyFactory.setInterfaces(TaskService.class);
        // 添加前置增强
        proxyFactory.addAdvice(new MyBeforeAdvice());
        // 添加后置增强
        proxyFactory.addAdvice(new MyAfterReturningAdvice());
        // 添加环绕增强
        proxyFactory.addAdvice(new MyRoundAdvice());
        // 获取代理对象
        TaskService proxy = (TaskService) proxyFactory.getProxy();
        proxy.sync1();
    }

    @Test
    void sync2() {
        ProxyFactory proxyFactory = new ProxyFactory();
        TaskService taskService = new TaskServiceImpl();
        proxyFactory.setTarget(taskService);
        proxyFactory.setInterfaces(TaskService.class);

        proxyFactory.addAdvice(new MyThrowsAdvice());
        // 获取代理对象
        TaskService proxy = (TaskService) proxyFactory.getProxy();
        proxy.sync2();
    }

}
