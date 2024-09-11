package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname YamlPropertyBootApplication
 * @Description
 * @Author rookie
 * @Date 2021/8/18 9:51
 * @Version 1.0
 */
@SpringBootApplication
public class YamlPropertyBootApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication();


        springApplication.run(YamlPropertyBootApplication.class, args);


    }
}
