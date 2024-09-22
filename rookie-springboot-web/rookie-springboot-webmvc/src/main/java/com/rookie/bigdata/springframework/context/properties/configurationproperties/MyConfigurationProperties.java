package com.rookie.bigdata.springframework.context.properties.configurationproperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/21 9:04
 * @Version 1.0
 */
@Data
@Configuration
@ConfigurationProperties("my.config.properties")
public class MyConfigurationProperties {

    private String name;

    private boolean enabled;

    private final Security security=new Security();

    @Data
    public static class Security{
        private String username;
    }
}
