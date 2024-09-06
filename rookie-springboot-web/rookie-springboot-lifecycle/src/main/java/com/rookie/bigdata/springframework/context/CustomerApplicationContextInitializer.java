package com.rookie.bigdata.springframework.context;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author rookie
 * @Description 用于在刷新容器之前初始化Spring的回调接口。参考ContextIdApplicationContextInitializer
 *
 * ConfigurationWarningsApplicationContextInitializer 用于添加BeanFactoryPostProcessor即后置处理器
 * @Date 2024/9/3 21:37
 * @Version 1.0
 */
@Slf4j
public class CustomerApplicationContextInitializer  implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        //例如利用Environment上下文环境注册属性源、激活配置文件等等。
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //如添加环境信息


        log.info("初始化ApplicationContextInitializer...");
    }
}
