package com.rookie.bigdata.springframework.context.annotation.aware.importaware.config;

import com.rookie.bigdata.springframework.context.annotation.aware.importaware.annotation.EnableXcs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Class MyImportAware
 * @Description
 * @Author rookie
 * @Date 2024/7/9 9:28
 * @Version 1.0
 */
@Slf4j
public class MyImportAware implements ImportAware {

    private AnnotationAttributes enableXcs;

    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        this.enableXcs = AnnotationAttributes.fromMap(
                importMetadata.getAnnotationAttributes(EnableXcs.class.getName(), false));
        if (this.enableXcs == null) {
            throw new IllegalArgumentException(
                    "@EnableXcs is not present on importing class " + importMetadata.getClassName());
        }
    }

    @Bean
    public String customBean() {
        return "This is a custom bean!";
    }
}
