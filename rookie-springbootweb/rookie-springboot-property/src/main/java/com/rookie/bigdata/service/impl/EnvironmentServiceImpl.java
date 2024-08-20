package com.rookie.bigdata.service.impl;

import com.rookie.bigdata.service.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * @Class EnvironmentServiceImpl
 * @Description
 * @Author rookie
 * @Date 2024/8/20 15:35
 * @Version 1.0
 */
public class EnvironmentServiceImpl implements EnvironmentService {

    @Autowired
    private Environment environment;
}
