package com.rookie.bigdata.springframework.core.convert.converter;

import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.convert.support.GenericConversionService;


/**
 * @Class StringToNumberConverterFactoryTest
 * @Description
 * @Author rookie
 * @Date 2024/7/10 15:17
 * @Version 1.0
 */
class StringToNumberConverterFactoryTest {



    @Test
    void getConverter(){
        // 创建一个默认的转换服务
        // 这里使用 GenericConversionService，它是一个通用的类型转换服务
        GenericConversionService conversionService = new DefaultConversionService();

        // 向转换服务中添加一个字符串到数字的转换器工厂
        // StringToNumberConverterFactory 是一个工厂类，用于创建字符串到数字的转换器
        conversionService.addConverterFactory(new StringToNumberConverterFactory());




        // 使用转换服务将字符串 "8" 转换为 Integer 类型
        // 这里演示了如何将字符串转换为对应的整数
        Integer num = conversionService.convert("8", Integer.class);

        // 输出转换结果
        System.out.println("String to Integer: " + num);
    }
}
