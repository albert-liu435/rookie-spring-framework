package com.rookie.bigdata.springframework.core.io.support;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyPathMatchingResourcePatternResolverTest
 * @Description
 * @Author rookie
 * @Date 2024/7/10 10:45
 * @Version 1.0
 */

@Slf4j
class MyPathMatchingResourcePatternResolverTest {

    @Test
    void test01()throws Exception{
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        // 加载所有匹配的类路径资源
        Resource[] resources = resolver.getResources("classpath*:*.properties");
        for (Resource resource : resources) {
            log.info("Classpath = " + resource.getFilename());
        }

        // 加载文件系统中的所有匹配资源
        Resource[] fileResources = resolver.getResources("file:/idea-work-space-xcs/spring-reading/spring-resources/spring-resource-resourceLoader/*.txt");
        for (Resource resource : fileResources) {
            log.info("File = " + resource.getFilename());
        }
    }

}
