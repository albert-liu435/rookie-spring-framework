package com.rookie.bigdata.designpatterns.build;

import org.junit.jupiter.api.Test;

/**
 * @Class StringBuilderTest
 * @Description
 * @Author rookie
 * @Date 2024/12/13 11:16
 * @Version 1.0
 */
public class StringBuilderTest {


    @Test
    void test01(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(1)
                .append("个张三, 和")
                .append(4)
                .append("个李四");

        System.out.println(stringBuilder.toString());
    }
}
