package com.rookie.bigdata.springframework.core.io.resource;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyByteArrayResourceTest
 * @Description
 * @Author rookie
 * @Date 2024/7/10 10:19
 * @Version 1.0
 */

@Slf4j
class MyByteArrayResourceTest {


    @Test
    void test01() throws Exception {
        byte[] data = "hello world".getBytes();
        Resource resource = new ByteArrayResource(data);
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
//            System.out.println(new String(is.readAllBytes()));
            log.info(new String(is.readAllBytes()));
        }
    }
}
