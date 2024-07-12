package com.rookie.bigdata.springframework.core.io.resource;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyUrlResourceTest
 * @Description
 * @Author rookie
 * @Date 2024/7/10 10:17
 * @Version 1.0
 */
@Slf4j
class MyUrlResourceTest {


    @Test
    void test01() throws Exception {

        ClassLoader classLoader = MyUrlResource.class.getClassLoader();

        Resource resource = new UrlResource("https://dist.apache.org/repos/dist/test/test.txt");
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
//            System.out.println(new String(is.readAllBytes()));
            log.info(new String(is.readAllBytes()));
        }
    }

}
