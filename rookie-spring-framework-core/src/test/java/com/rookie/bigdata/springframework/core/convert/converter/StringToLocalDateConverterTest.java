package com.rookie.bigdata.springframework.core.convert.converter;

import com.rookie.bigdata.springframework.core.convert.converter.normal.StringToBooleanConverter;
import com.rookie.bigdata.springframework.core.convert.converter.normal.StringToLocalDateConverter;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;

import java.time.LocalDate;

/**
 * @Class StringToLocalDateConverterTest
 * @Description
 * @Author rookie
 * @Date 2024/7/10 15:10
 * @Version 1.0
 */
class StringToLocalDateConverterTest {

    @Test
    void convert() {
        //创建一个默认的转换服务
        DefaultConversionService service=new DefaultConversionService();

        //向服务中添加自定义的转换器
        service.addConverter(new StringToLocalDateConverter());
        service.addConverter(new StringToBooleanConverter());

        // 检查是否可以将字符串转换为 LocalDate
        if (service.canConvert(String.class, LocalDate.class)) {
            LocalDate localDate = service.convert("2023-12-07", LocalDate.class);
            System.out.println("LocalDate = " + localDate);
        }

        // 检查是否可以将字符串 "yes" 转换为 Boolean
        if (service.canConvert(String.class, Boolean.class)) {
            Boolean boolValue = service.convert("yes", Boolean.class);
            System.out.println("yes = " + boolValue);
        }

        // 检查是否可以将字符串 "no" 转换为 Boolean
        if (service.canConvert(String.class, Boolean.class)) {
            Boolean boolValue = service.convert("no", Boolean.class);
            System.out.println("no = " + boolValue);
        }

    }
}
