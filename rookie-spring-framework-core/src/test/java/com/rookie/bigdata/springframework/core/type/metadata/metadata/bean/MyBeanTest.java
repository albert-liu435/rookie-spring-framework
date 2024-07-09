package com.rookie.bigdata.springframework.core.type.metadata.metadata.bean;

import org.junit.jupiter.api.Test;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyBeanTest
 * @Description
 * @Author rookie
 * @Date 2024/7/9 10:32
 * @Version 1.0
 */
class MyBeanTest {

    @Test
    void test01() throws Exception {
        //创建MetadataReaderFactory
        SimpleMetadataReaderFactory readerFactory = new SimpleMetadataReaderFactory();
        //获取MetadataReader
        MetadataReader metadataReader = readerFactory.getMetadataReader("com.rookie.bigdata.springframework.core.type.metadata.metadata.bean.MyBean");

        //获取AnnotationMetadata
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        System.out.println("AnnotationMetadata impl class is " + annotationMetadata.getClass());

        // 检查 MyBean 类是否被 @Component 注解标记
        boolean isComponent = annotationMetadata.hasAnnotation(Component.class.getName());
        System.out.println("MyBean is a @Component: " + isComponent);

        // 获取 MyBean 类上的注解属性
        if (isComponent) {
            Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(Component.class.getName());
            System.out.println("@Component value is " + annotationAttributes.get("value"));
        }
    }


    @Test
    void test02() throws Exception {

        // 获取 AnnotationMetadata
        AnnotationMetadata annotationMetadata = AnnotationMetadata.introspect(MyBean.class);

        System.out.println("AnnotationMetadata impl class is " + annotationMetadata.getClass());

        // 检查 MyBean 类是否被 @Component 注解标记
        boolean isComponent = annotationMetadata.hasAnnotation(Component.class.getName());
        System.out.println("MyBean is a @Component: " + isComponent);

        // 获取 MyBean 类上的注解属性
        if (isComponent) {
            Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(Component.class.getName());
            System.out.println("@Component value is " + annotationAttributes.get("value"));
        }


    }

}
