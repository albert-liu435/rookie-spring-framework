package com.rookie.bigdata.springframework.core.convert.converter.normal;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Class StringToLocalDateConverter
 * @Description
 * @Author rookie
 * @Date 2024/7/10 15:07
 * @Version 1.0
 */
public class StringToLocalDateConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String source) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(source, df);
    }
}
