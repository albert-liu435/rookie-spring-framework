package com.rookie.bigdata.springframework.context.annotation.conditional;

/**
 * @Author rookie
 * @Description TODO
 * @Date 2024/7/1 20:53
 * @Version 1.0
 */
@Configuration
public class SystemBeanConfig {


    @Conditional(WindowsCondition.class)
    @Bean(name = "windows")
    public System system1() {
        return new System("Windows");
    }

    @Conditional(LinuxCondition.class)
    @Bean(name = "linux")
    public System system2() {
        return new System("Linux");
    }
}
