package com.rookie.bigdata.springframework.beans.propertyeditors.anno;

import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.PropertyEditorRegistrySupport;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/4 22:17
 * @Version 1.0
 */
@Component
public class CustomEditorConfigurer extends PropertyEditorRegistrySupport {

    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Date.class, new CustomerDateEditor());
    }
}
