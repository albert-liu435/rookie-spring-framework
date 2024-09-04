package com.rookie.bigdata.springframework.beans.propertyeditors.yourbatman;

import java.beans.PropertyEditorSupport;

/**
 * @Class AnimalPropertyEditor
 * @Description
 * @Author rookie
 * @Date 2024/9/4 17:26
 * @Version 1.0
 */
public class AnimalPropertyEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        return null;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

    }
}
