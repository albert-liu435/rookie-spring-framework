package com.rookie.bigdata.springframework.beans.factory.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

/**
 * @Class SpringEnvironment
 * @Description EnvironmentCapable的含义是让其继承类具有Environment的能力，也就是说可以提供Environment
 * @Author rookie
 * @Date 2024/7/1 15:27
 * @Version 1.0
 */
@Slf4j
public class SpringEnvironment implements EnvironmentAware, EnvironmentCapable {

    public SpringEnvironment() {

    }


    @Nullable
    private ConfigurableEnvironment environment;

    @Override
    public void setEnvironment(Environment environment) {
        log.info("SpringEnvironment设置环境信息：{}",environment);
        Assert.isInstanceOf(ConfigurableEnvironment.class, environment, "ConfigurableEnvironment required");
        this.environment = (ConfigurableEnvironment) environment;
    }

    @Override
    public Environment getEnvironment() {
        if (this.environment == null) {
            this.environment = createEnvironment();
        }
        return this.environment;
    }

    protected ConfigurableEnvironment createEnvironment() {
        return new StandardEnvironment();
    }
}

