package com.rookie.bigdata.springframework.format;

import org.springframework.format.Printer;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @Class CurrencyPrinter
 * @Description
 * @Author rookie
 * @Date 2024/7/10 16:31
 * @Version 1.0
 */
public class CurrencyPrinter implements Printer<Number> {

    @Override
    public String print(Number number, Locale locale) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        return currencyFormat.format(number);
    }
}
