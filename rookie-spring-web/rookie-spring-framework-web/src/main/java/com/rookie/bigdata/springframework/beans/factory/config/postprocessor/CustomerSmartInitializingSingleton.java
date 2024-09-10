package com.rookie.bigdata.springframework.beans.factory.config.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * @Class CustomerSmartInitializingSingleton
 * @Description
 * @Author rookie
 * @Date 2024/9/10 9:54
 * @Version 1.0
 */
@Slf4j
@Component
public class CustomerSmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {
        log.error("050执行SmartInitializingSingleton#afterSingletonsInstantiated");
    }
}
