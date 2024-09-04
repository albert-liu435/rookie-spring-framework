package com.rookie.bigdata.springframework.beans.propertyeditors.yourbatman01;

import org.springframework.beans.propertyeditors.UUIDEditor;

/**
 * @Class PersonCatUUIDEditor
 * @Description
 * @Author rookie
 * @Date 2024/9/4 18:04
 * @Version 1.0
 */
public class PersonCatUUIDEditor extends UUIDEditor {

    private static final String SUFFIX = "_YourBatman";

    @Override
    public String getAsText() {
        return super.getAsText().concat(SUFFIX);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        text = text.replace(SUFFIX, "");
        super.setAsText(text);
    }
}
