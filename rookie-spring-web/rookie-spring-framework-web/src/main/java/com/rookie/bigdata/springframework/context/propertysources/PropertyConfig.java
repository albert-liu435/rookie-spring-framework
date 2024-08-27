//package com.rookie.bigdata.springframework.context.propertysources;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//
///**
// * @Class PropertyConfig
// * @Description
// * @Author rookie
// * @Date 2024/8/26 17:10
// * @Version 1.0
// */
//@Configuration
//public class PropertyConfig {
//
//    @Value("${jdbc.url}")
//    private String url;
//
//    @Value("${jdbc.username}")
//    private String userName;
//
//    @Value("${jdbc.password}")
//    private String password;
//
//    @Bean
//    public DataSource dataSource1() {
//        return new DriverManagerDataSource(url, userName, password);
//    }
//}
