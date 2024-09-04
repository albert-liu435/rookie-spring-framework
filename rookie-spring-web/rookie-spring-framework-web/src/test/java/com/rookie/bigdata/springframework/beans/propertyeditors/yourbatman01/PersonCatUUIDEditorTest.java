package com.rookie.bigdata.springframework.beans.propertyeditors.yourbatman01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.PropertyEditorRegistrySupport;
import org.springframework.beans.propertyeditors.UUIDEditor;

import java.beans.PropertyEditor;
import java.util.UUID;

/**
 * @Class PersonCatUUIDEditorTest
 * @Description
 * @Author rookie
 * @Date 2024/9/4 18:04
 * @Version 1.0
 */
class PersonCatUUIDEditorTest {


    @Test
    void test01(){
        PropertyEditorRegistry propertyEditorRegistry = new PropertyEditorRegistrySupport();
        // 通用的
        propertyEditorRegistry.registerCustomEditor(UUID.class, new UUIDEditor());
        // 专用的
        propertyEditorRegistry.registerCustomEditor(Person.class, "cat.uuid", new PersonCatUUIDEditor());


        String uuidStr = "1-2-3-4-5";
        String personCatUuidStr = "1-2-3-4-5_YourBatman";

        PropertyEditor customEditor = propertyEditorRegistry.findCustomEditor(UUID.class, null);
        // customEditor.setAsText(personCatUuidStr); // 抛异常：java.lang.NumberFormatException: For input string: "5_YourBatman"
        customEditor.setAsText(uuidStr);
        System.out.println(customEditor.getAsText());

        customEditor = propertyEditorRegistry.findCustomEditor(Person.class, "cat.uuid");
        customEditor.setAsText(personCatUuidStr);
        System.out.println(customEditor.getAsText());
    }

}
