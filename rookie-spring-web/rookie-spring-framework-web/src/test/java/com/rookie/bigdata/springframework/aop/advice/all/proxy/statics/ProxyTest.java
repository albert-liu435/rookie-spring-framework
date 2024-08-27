package com.rookie.bigdata.springframework.aop.advice.all.proxy.statics;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ProxyTest
 * @Description
 * @Author rookie
 * @Date 2024/8/27 15:16
 * @Version 1.0
 */
@Slf4j
class ProxyTest {

    @Test
    void get() {

        HttpApi httpApi=new RealModule();

        HttpApi proxy=new Proxy(httpApi);
        String s = proxy.get("www.baidu.com");

        log.info("返回的信息：{}",s);
    }
}
