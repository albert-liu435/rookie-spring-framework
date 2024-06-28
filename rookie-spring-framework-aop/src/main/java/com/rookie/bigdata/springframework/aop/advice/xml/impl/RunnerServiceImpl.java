package com.rookie.bigdata.springframework.aop.advice.xml.impl;

import com.rookie.bigdata.springframework.aop.advice.xml.RunnerService;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class ApplicationRunnerService
 * @Description
 * @Author rookie
 * @Date 2024/6/28 15:45
 * @Version 1.0
 */
@Slf4j
public class RunnerServiceImpl implements RunnerService {


    @Override
    public void run() {
        log.info("exce run ...");
    }
}
