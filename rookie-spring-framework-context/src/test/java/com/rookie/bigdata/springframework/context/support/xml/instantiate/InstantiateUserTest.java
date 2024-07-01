package com.rookie.bigdata.springframework.context.support.xml.instantiate;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class InstantiateUserTest
 * @Description https://blog.csdn.net/Sheng_Q/article/details/128277691?spm=1001.2014.3001.5502
 * @Author rookie
 * @Date 2024/7/1 16:13
 * @Version 1.0
 */
class InstantiateUserTest {


    @Test
    void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springframework/context/support/xml/Instantiate-spring.xml");


    }

}
