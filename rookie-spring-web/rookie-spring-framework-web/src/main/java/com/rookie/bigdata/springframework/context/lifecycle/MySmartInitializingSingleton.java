package com.rookie.bigdata.springframework.context.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * @Class MySmartInitializingSingleton
 * @Description
 * @Author rookie
 * @Date 2024/8/22 15:08
 * @Version 1.0
 */
@Slf4j
public class MySmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {

        log.error("调用SmartInitializingSingleton#afterSingletonsInstantiated");
    }
}
