package com.rookie.bigdata.springframework.context.annotation.imports.selectors;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Class MyInportSelector
 * @Description
 * @Author rookie
 * @Date 2024/6/28 10:56
 * @Version 1.0
 */
public class CustomerImportSelector implements ImportSelector {

    /**
     * 该方法返回值不可以返回null，否则会报错
     * 无Bean注册时，可返回一个空数组，切不可返回null
     *
     * @param importingClassMetadata    标注了@Import注解类的所有注解信息
     * @return  返回值为导入到容器中的组件全类名数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.rookie.bigdata.springframework.context.annotation.imports.bean.Person","com.rookie.bigdata.springframework.context.annotation.imports.bean.User"};
    }
}
