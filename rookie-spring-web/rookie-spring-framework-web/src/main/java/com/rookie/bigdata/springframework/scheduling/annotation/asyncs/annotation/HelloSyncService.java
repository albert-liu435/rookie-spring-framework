package com.rookie.bigdata.springframework.scheduling.annotation.asyncs.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Class HelloSyncService
 * @Description
 * @Author rookie
 * @Date 2024/8/30 11:43
 * @Version 1.0
 */
@Component
@Slf4j
public class HelloSyncService {

    @TestAnnotation
    public void print() {
        System.out.println(Thread.currentThread().getName() + ":" + " test Async call");
    }
}
