package com.rookie.bigdata.springframework.context;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/3 21:37
 * @Version 1.0
 */
@Slf4j
public class CustomerApplicationContextInitializer  implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        log.info("初始化ApplicationContextInitializer...");
    }
}
