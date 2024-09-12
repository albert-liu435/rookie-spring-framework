package com.rookie.bigdata.springframework.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Class CustomerApplicationRunner
 * @Description
 * @Author rookie
 * @Date 2024/9/12 11:10
 * @Version 1.0
 */
@Slf4j
@Component
public class CustomerApplicationRunner implements ApplicationRunner, CommandLineRunner, EnvironmentAware {

    private Environment environment;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //没有@ActiveProfiles注解
        String txtValue = environment.getProperty("com.rookie.bigdata.spring.application.dev");
        log.info("获取的value为:{}", txtValue);
        log.info("执行ApplicationRunner");

    }

    @Override
    public void run(String... args) throws Exception {
        log.info("执行CommandLineRunner");
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment=environment;
    }
}
