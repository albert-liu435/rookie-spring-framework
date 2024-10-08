package com.rookie.bigdata.springframework.beans.propertyeditors.anno;

import org.springframework.lang.Nullable;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Class CustomerDateEditor
 * @Description  可以参考 org.springframework.beans.propertyeditors.CustomDateEditor
 * @Author rookie
 * @Date 2024/9/4 15:39
 * @Version 1.0
 */
public class CustomerDateEditor extends PropertyEditorSupport {

    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD");

    private String format = "yyyy-MM-dd";

    public void setFormat(String format) {
        this.format = format;
    }


    @Override
    public void setAsText(@Nullable String text) throws IllegalArgumentException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);


        try {
            setValue(this.dateFormat.parse(text));
        }
        catch (ParseException ex) {
            throw new IllegalArgumentException("Could not parse date: " + ex.getMessage(), ex);
        }
    }

    @Override
    public String getAsText() {
        Date value = (Date) getValue();
        return (value != null ? this.dateFormat.format(value) : "");
    }
}
