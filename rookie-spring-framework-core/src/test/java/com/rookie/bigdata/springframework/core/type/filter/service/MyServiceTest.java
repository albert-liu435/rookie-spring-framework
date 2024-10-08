package com.rookie.bigdata.springframework.core.type.filter.service;

import com.rookie.bigdata.springframework.core.type.filter.anno.MyAnnotation;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyServiceTest
 * @Description https://github.com/xuchengsheng/spring-reading?tab=readme-ov-file
 * @Author rookie
 * @Date 2024/7/9 10:43
 * @Version 1.0
 */
class MyServiceTest {

    @Test
    void test01()throws Exception{
        // 创建路径匹配的资源模式解析器
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        // 创建一个简单的元数据读取器工厂
        SimpleMetadataReaderFactory metadataReaderFactory = new SimpleMetadataReaderFactory();

        // 创建一个注解类型过滤器，用于匹配带有 MyAnnotation 注解的类
        TypeFilter annotationTypeFilter = new AnnotationTypeFilter(MyAnnotation.class);

        // 使用资源模式解析器获取所有匹配指定路径的类文件
        Resource[] resources = resolver.getResources("classpath*:com/rookie/bigdata/springframework/core/type/filter/**/*.class");

        // 遍历扫描到的类文件
        for (Resource resource : resources) {
            // 获取元数据读取器
            MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(resource);

            // 使用注解类型过滤器匹配当前类
            boolean match = annotationTypeFilter.match(metadataReader, metadataReaderFactory);

            // 输出扫描到的文件名和匹配结果
            System.out.printf("扫描到的文件: %-20s || 筛选器是否匹配: %s%n", resource.getFile().getName(), match);
        }
    }

}
