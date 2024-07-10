package com.rookie.bigdata.springframework.beans.beanwrapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanWrapperImpl;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyCustomDateEditorTest
 * @Description
 * @Author rookie
 * @Date 2024/7/10 14:50
 * @Version 1.0
 */
class MyCustomDateEditorTest {

    @Test
    void getAsText() {
        // 创建一个 BeanWrapperImpl 实例，用于操作 MyBean 类。
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(MyBean.class);

        // 为 Date 类型的属性注册自定义的属性编辑器 MyCustomDateEditor。
        beanWrapper.overrideDefaultEditor(Date.class, new MyCustomDateEditor());

        // 设置 MyBean 类中名为 "date" 的属性值，使用字符串 "2023-12-5"。
        // 这里会使用注册的 MyCustomDateEditor 来将字符串转换为 Date 对象。
        beanWrapper.setPropertyValue("date", "2023-12-5");

        // 设置 MyBean 类中名为 "path" 的属性值，使用字符串 "/opt/spring-reading"。
        // 因为没有为 Path 类型注册特定的编辑器，所以使用默认转换逻辑。
        beanWrapper.setPropertyValue("path", "/opt/spring-reading");

        // 输出最终包装的 MyBean 实例。
        System.out.println("MyBean = " + beanWrapper.getWrappedInstance());
    }
}
