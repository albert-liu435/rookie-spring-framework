package com.rookie.bigdata.springframework.core.convert.converter.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.util.ReflectionUtils;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class AnnotatedStringToDateConverterTest
 * @Description
 * @Author rookie
 * @Date 2024/7/10 15:22
 * @Version 1.0
 */


class AnnotatedStringToDateConverterTest {


    @Test
    void test01(){
        // 创建一个默认的转换服务
        DefaultConversionService service = new DefaultConversionService();
        // 向转换服务中添加自定义的转换器
        service.addConverter(new AnnotatedStringToDateConverter());

        // 定义源类型和目标类型，准备将 String 转换为 Date
        TypeDescriptor sourceType1 = TypeDescriptor.valueOf(String.class);
        TypeDescriptor targetType1 = new TypeDescriptor(ReflectionUtils.findField(MyBean.class, "date"));
        // 执行转换操作
        Date date = (Date) service.convert("2023-01-01", sourceType1, targetType1);

        // 定义另一组源类型和目标类型，准备将另一个 String 格式转换为 Date
        TypeDescriptor sourceType2 = TypeDescriptor.valueOf(String.class);
        TypeDescriptor targetType2 = new TypeDescriptor(ReflectionUtils.findField(MyBean.class, "dateTime"));
        // 执行转换操作
        Date dateTime = (Date) service.convert("2023-01-01 23:59:59", sourceType2, targetType2);

        // 使用转换得到的日期对象设置 MyBean 实例的属性
        MyBean myBean = new MyBean();
        myBean.setDate(date);
        myBean.setDateTime(dateTime);

        // 输出转换结果
        System.out.println("myBean = " + myBean);
    }

}
