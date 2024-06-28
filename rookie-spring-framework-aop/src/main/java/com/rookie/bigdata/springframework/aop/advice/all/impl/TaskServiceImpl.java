package com.rookie.bigdata.springframework.aop.advice.all.impl;

import com.rookie.bigdata.springframework.aop.advice.all.TaskService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class TaskServiceImpl
 * @Description
 * @Author rookie
 * @Date 2024/6/28 13:51
 * @Version 1.0
 */

@Slf4j
public class TaskServiceImpl implements TaskService {
    @Override
    public void sync1() {
        log.info("sync sync1");

    }

    @SneakyThrows
    @Override
    public void sync2() {
        log.info("sync sync2");
        throw new RuntimeException("异常");

//        throw new Exception("异常");
    }
}
