package com.rookie.bigdata.springframework.context.annotation.componentscan.filter;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

/**
 * @Class CustomFilter
 * @Description
 * @Author rookie
 * @Date 2024/7/1 17:28
 * @Version 1.0
 */
public class CustomFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
        // 在这里编写你的过滤逻辑，根据需要返回 true 或 false
        // metadataReader 可以获取到正在扫描的组件的元数据信息，例如类名、注解等
        // metadataReaderFactory 可以获取到其他类的元数据信息

        // 示例：只匹配类名以 "Service" 结尾的组件
        String className = metadataReader.getClassMetadata().getClassName();
        return className.endsWith("Dao");
    }
}
