package com.rookie.bigdata.springframework.core.convert.converter.normal;

import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

/**
 * @Class StringToBooleanConverter
 * @Description
 * @Author rookie
 * @Date 2024/7/10 14:53
 * @Version 1.0
 */
public class StringToBooleanConverter implements Converter<String, Boolean> {


    private static final Set<String> trueValues = new HashSet<>(8);

    private static final Set<String> falseValues = new HashSet<>(8);

    static {
        trueValues.add("true");
        trueValues.add("on");
        trueValues.add("yes");
        trueValues.add("1");

        falseValues.add("false");
        falseValues.add("off");
        falseValues.add("no");
        falseValues.add("0");
    }


    @Override
    public Boolean convert(String source) {
        if (trueValues.contains(source)) {
            return Boolean.TRUE;
        }

        if (falseValues.contains(source)) {
            return Boolean.FALSE;
        }


        throw new IllegalArgumentException("Invalid boolean value '" + source + "'");
    }
}
