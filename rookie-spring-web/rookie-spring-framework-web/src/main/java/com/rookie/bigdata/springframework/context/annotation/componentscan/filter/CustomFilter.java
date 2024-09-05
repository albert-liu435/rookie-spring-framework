package com.rookie.bigdata.springframework.context.annotation.componentscan.filter;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Class CustomFilter
 * @Description
 * @Author rookie
 * @Date 2024/9/5 11:49
 * @Version 1.0
 */
public class CustomFilter implements TypeFilter {

    /**
     * 此方法返回一个boolean类型的值。
     * 当返回true时，表示加入到spring的容器中。返回false时，不加入容器。
     * 参数metadataReader：表示读取到的当前正在扫描的类的信息
     * 参数metadataReaderFactory：表示可以获得到其他任何类的信息
     *
     * @param metadataReader        the metadata reader for the target class
     * @param metadataReaderFactory a factory for obtaining metadata readers
     *                              for other classes (such as superclasses and interfaces)
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 在这里编写你的过滤逻辑，根据需要返回 true 或 false
        // metadataReader 可以获取到正在扫描的组件的元数据信息，例如类名、注解等
        // metadataReaderFactory 可以获取到其他类的元数据信息

        //获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前正在扫描的类名
        String className = classMetadata.getClassName();
//        return className.contains("Dao");

//        String className = metadataReader.getClassMetadata().getClassName();

//        可以看到，自定义过滤规则ComponentScanFilter类实现了TypeFilter接口，并覆写了match()方法，match()方法中的核心逻辑就是：如果类的名称中以Dao结尾，符合过滤规则，返回true，否则，返回false。
        return className.endsWith("Dao");
    }
}
