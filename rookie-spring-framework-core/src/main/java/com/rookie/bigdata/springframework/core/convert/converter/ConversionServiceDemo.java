package com.rookie.bigdata.springframework.core.convert.converter;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.support.DefaultConversionService;

/**
 * @Class ConversionServiceDemo
 * @Description
 * @Author rookie
 * @Date 2024/7/10 16:30
 * @Version 1.0
 */
public class ConversionServiceDemo {

    public static void main(String[] args) {
        // 创建 DefaultConversionService 实例
        ConversionService conversionService = new DefaultConversionService();

        // 使用 canConvert 检查转换是否可能
        if (conversionService.canConvert(Integer.class, String.class)) {
            System.out.println("Can convert from Integer to String");

            // 执行转换操作，将 Integer 转换为 String
            String converted = conversionService.convert(666, String.class);
            System.out.println("Converted: " + converted);
        }

        // 使用 TypeDescriptor 检查转换是否可能
        if (conversionService.canConvert(
                TypeDescriptor.valueOf(Integer.class),
                TypeDescriptor.valueOf(String.class))) {
            System.out.println("Can convert from Integer to String using TypeDescriptors");

            // 使用 TypeDescriptor 执行转换
            Object convertedWithTypeDescriptor = conversionService.convert(
                    888,
                    TypeDescriptor.valueOf(Integer.class),
                    TypeDescriptor.valueOf(String.class));
            System.out.println("Converted with TypeDescriptors: " + convertedWithTypeDescriptor);
        }
    }
}

