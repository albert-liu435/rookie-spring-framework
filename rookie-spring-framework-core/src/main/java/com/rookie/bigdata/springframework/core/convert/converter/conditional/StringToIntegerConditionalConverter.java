package com.rookie.bigdata.springframework.core.convert.converter.conditional;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalConverter;
import org.springframework.core.convert.converter.Converter;

/**
 * @Class StringToIntegerConditionalConverter
 * @Description
 * @Author rookie
 * @Date 2024/7/10 16:28
 * @Version 1.0
 */
public class StringToIntegerConditionalConverter implements Converter<String, Integer>, ConditionalConverter {

    @Override
    public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
        // 判断条件：当源类型是 String 且目标类型是 Integer 时返回 true
        return String.class.equals(sourceType.getType()) && Integer.class.equals(targetType.getType());
    }

    @Override
    public Integer convert(String source) {
        if (source == null || source.isEmpty()) {
            return null;
        }
        try {
            return Integer.parseInt(source);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unable to convert String to Integer: " + source, e);
        }
    }
}
