package com.rookie.bigdata.stereotype;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Class ComponmentConfig
 * @Description
 * @Author rookie
 * @Date 2024/6/27 14:55
 * @Version 1.0
 */

@Configuration
@ComponentScan(value = "com.rookie.bigdata.stereotype.service")
public class ComponentConfig {
}
