package com.rookie.bigdata.springframework.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/3 22:38
 * @Version 1.0
 */
@Slf4j
@Component
public class CustomerApplicationRunner implements ApplicationRunner, CommandLineRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("执行ApplicationRunner");

    }

    @Override
    public void run(String... args) throws Exception {
        log.info("执行CommandLineRunner");
    }
}
