package com.rookie.bigdata.springframework.context.support.xml.instantiate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * @Class MySmartInitializingSingleton
 * @Description
 * @Author rookie
 * @Date 2024/7/1 16:12
 * @Version 1.0
 */

@Slf4j
public class MySmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {

        log.info("所有的Bean已经实例化完成");
    }
}
