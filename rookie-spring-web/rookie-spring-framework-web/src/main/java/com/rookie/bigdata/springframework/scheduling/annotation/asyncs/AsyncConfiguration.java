package com.rookie.bigdata.springframework.scheduling.annotation.asyncs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Class AsyncConfiguration
 * @Description
 * @Author rookie
 * @Date 2024/8/28 11:21
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.rookie.bigdata.springframework.scheduling.annotation.asyncs.service")
@EnableAsync
public class AsyncConfiguration {

//    /**
//     * 自定义配置线程池，用于执行异步任务使用
//     *
//     * @return
//     */
//    @Bean
//    public Executor myTaskExecutor() {
//        return Executors.newFixedThreadPool(1);
//    }


    /**
     * Spring为@Async提供了默认线程池配置
     * <p>
     * (3) 使用Spring框架默认的SimpleAsyncTaskExecutor线程池.
     * 若业务未配置默认线程池，默认使用Spring生成的SimpleAsyncTaskExecutor对象； 但执行时日志中会给出异常信息。
     *
     * @return
     */
    @Bean("myTaskExecutor")
    public TaskExecutor myTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }

}
