package com.rookie.bigdata.springframework.core.io;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyClassPathResourceTest
 * @Description
 * @Author rookie
 * @Date 2024/7/9 10:00
 * @Version 1.0
 */
@Slf4j
class MyClassPathResourceTest {

    @Test
    void test01()throws Exception{
        String path = "application.properties";
        Resource resource = new ClassPathResource(path);
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
//            System.out.println(new String(is.readAllBytes()));
            log.info(new String(is.readAllBytes()));
        }
    }

}
