package com.rookie.bigdata.springframework.core.io.resource;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyInputStreamResourceTest
 * @Description
 * @Author rookie
 * @Date 2024/7/10 10:20
 * @Version 1.0
 */

@Slf4j
class MyInputStreamResourceTest {

    @Test
    void test01()throws Exception{

        ClassLoader classLoader = MyInputStreamResource.class.getClassLoader();

        InputStream isSource = new ByteArrayInputStream("hello world".getBytes());
        Resource resource = new InputStreamResource(isSource);
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
            System.out.println(new String(is.readAllBytes()));
        }
    }


}
