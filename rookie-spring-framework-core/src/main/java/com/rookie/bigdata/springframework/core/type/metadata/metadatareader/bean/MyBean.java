package com.rookie.bigdata.springframework.core.type.metadata.metadatareader.bean;

import com.rookie.bigdata.springframework.core.type.metadata.metadatareader.anno.MyAnnotation;
import com.rookie.bigdata.springframework.core.type.metadata.metadatareader.anno.MyClassAnnotation;

import java.io.Serializable;

/**
 * @Class MyBean
 * @Description
 * @Author rookie
 * @Date 2024/7/9 10:13
 * @Version 1.0
 */
@MyClassAnnotation
public final class MyBean extends MyAbstract implements Serializable {

    public String key;

    public String value;

    @MyAnnotation
    public static void myMethod1() {
        // 方法1的实现
    }

    @MyAnnotation
    public String myMethod2() {
        return "hello world";
    }

    public void myMethod3() {
        // 方法3的实现
    }

    public static class MyInnerClass {
        // 内部类的定义
    }
}
