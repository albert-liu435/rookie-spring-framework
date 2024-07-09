package com.rookie.bigdata.springframework.core.io.resource;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyFileSystemResourceTest
 * @Description
 * @Author rookie
 * @Date 2024/7/9 10:04
 * @Version 1.0
 */
@Slf4j
class MyFileSystemResourceTest {


    @Test
    void test01()throws Exception{
        // 请替换你自己的目录
        String path = "C:\\work\\NewIDEAWorkSpace\\rookie-project\\github-albert-liu435\\rookie-spring-framework\\rookie-spring-framework-core\\myfile.txt";
        Resource resource = new FileSystemResource(path);
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
//            System.out.println(new String(is.readAllBytes()));
            log.info(new String(is.readAllBytes()));
        }
    }

}
