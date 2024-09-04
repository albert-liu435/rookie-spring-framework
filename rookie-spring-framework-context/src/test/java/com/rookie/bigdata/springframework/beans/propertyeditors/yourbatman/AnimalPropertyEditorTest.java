package com.rookie.bigdata.springframework.beans.propertyeditors.yourbatman;

import org.junit.jupiter.api.Test;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.PropertyEditorRegistrySupport;

import java.beans.PropertyEditor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class AnimalPropertyEditorTest
 * @Description
 * @Author rookie
 * @Date 2024/9/4 17:27
 * @Version 1.0
 */
class AnimalPropertyEditorTest {


    @Test
    void test01(){
        PropertyEditorRegistry propertyEditorRegistry = new PropertyEditorRegistrySupport();
        propertyEditorRegistry.registerCustomEditor(Animal.class, new AnimalPropertyEditor());

        // 付类型、子类型均可匹配上对应的编辑器
        PropertyEditor customEditor1 = propertyEditorRegistry.findCustomEditor(Cat.class, null);
        PropertyEditor customEditor2 = propertyEditorRegistry.findCustomEditor(Animal.class, null);
        System.out.println(customEditor1 == customEditor2);
        System.out.println(customEditor1.getClass().getSimpleName());
    }

}
