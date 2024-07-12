package com.rookie.bigdata.springframework.core.io.support;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyDefaultResourceLoaderTest
 * @Description
 * @Author rookie
 * @Date 2024/7/10 10:24
 * @Version 1.0
 */
@Slf4j
class MyDefaultResourceLoaderTest {


    @Test
    void test01(){

        ClassLoader classLoader = MyDefaultResourceLoader.class.getClassLoader();

        DefaultResourceLoader loader = new DefaultResourceLoader();

        // 从类路径加载资源
        Resource classpathResource = loader.getResource("classpath:application.properties");
        System.out.println("Classpath Exists= " + classpathResource.exists());

        // 加载文件系统中的资源
        Resource fileResource = loader.getResource("file:C:\\work\\NewIDEAWorkSpace\\rookie-project\\github-albert-liu435\\rookie-spring-framework\\rookie-spring-framework-core\\myfile1.txt");
        System.out.println("File Exists = " + fileResource.exists());
    }
}
