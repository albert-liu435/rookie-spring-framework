package com.rookie.bigdata.springframework.beans.factory.annotation.autowire;

import com.rookie.bigdata.springframework.beans.factory.annotation.autowire.service.Hello1ServiceImpl;
import com.rookie.bigdata.springframework.beans.factory.annotation.autowire.service.Hello2ServiceImpl;
import com.rookie.bigdata.springframework.beans.factory.annotation.autowire.service.Hello3ServiceImpl;
import com.rookie.bigdata.springframework.beans.factory.annotation.autowire.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @Class AutowiredConfig
 * @Description
 * @Author rookie
 * @Date 2024/7/3 15:16
 * @Version 1.0
 */
@Configuration
public class AutowiredConfig {
    //将所有的HelloService的实现类全部放到这个list中
    private List<HelloService> list;


    @Bean
    public static Hello1ServiceImpl initHello1ServiceImpl() {
        return new Hello1ServiceImpl();
    }

    @Bean
    public static Hello2ServiceImpl initHello2ServiceImpl() {
        return new Hello2ServiceImpl();
    }
    @Bean
    public static Hello3ServiceImpl initHello3ServiceImpl() {
        return new Hello3ServiceImpl();
    }

    @Autowired(required = false)
    public void setHelloService(List<HelloService> configurers) {
//        configurers.sort(AnnotationAwareOrderComparator.INSTANCE);
        this.list = configurers;
    }

}
