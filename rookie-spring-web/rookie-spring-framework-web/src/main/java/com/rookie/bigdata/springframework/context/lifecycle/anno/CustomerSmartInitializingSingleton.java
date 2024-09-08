package com.rookie.bigdata.springframework.context.lifecycle.anno;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/7 10:11
 * @Version 1.0
 */
@Slf4j
@Component
public class CustomerSmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {
        log.error("调用SmartInitializingSingleton#afterSingletonsInstantiated");
    }
}
