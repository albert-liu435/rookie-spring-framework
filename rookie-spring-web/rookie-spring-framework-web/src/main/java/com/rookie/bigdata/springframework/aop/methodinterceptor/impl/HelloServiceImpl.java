package com.rookie.bigdata.springframework.aop.methodinterceptor.impl;

import com.rookie.bigdata.springframework.aop.methodinterceptor.HelloService;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class HelloServiceImpl
 * @Description
 * @Author rookie
 * @Date 2024/6/28 16:04
 * @Version 1.0
 */
@Slf4j
public class HelloServiceImpl implements HelloService {

    @Override
    public void run() {
        log.info("exce run ...");
    }
}
