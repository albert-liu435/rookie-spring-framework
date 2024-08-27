package com.rookie.bigdata.springframework.context.propertysources;

import com.rookie.bigdata.springframework.context.annotation.configuration.ConfigurationAnnotationConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class PropertyConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/8/26 17:12
 * @Version 1.0
 */
@Slf4j
class PropertyConfigTest {


    @Test
    void testProerties() throws IOException {
        Properties properties=new Properties();

        Resource resource=new ClassPathResource("db/db.properties");

        properties.load(resource.getInputStream());


        log.info("properties:{}",properties);

    }


    @Test
    void testXml(){
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("springframework/context/propertysources/properties-spring.xml");
        DataSource dataSource = (DriverManagerDataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }

//    @Test
//    void dataSource1() {
//
//        //容器执行流程
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(PropertyConfig.class);
//        PropertyConfig config = context.getBean(PropertyConfig.class);
//
//        Map<String, DataSource> beansOfType = context.getBeansOfType(DataSource.class);
//
//        log.info("beansOfType:{}",beansOfType);
//
//    }
}
