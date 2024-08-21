package com.rookie.bigdata.boot.env;


import org.springframework.boot.env.PropertiesPropertySourceLoader;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;

import java.util.List;


/**
 * @Class TextPropertySourceLoader
 * @Description
 * @Author rookie
 * @Date 2024/8/20 16:25
 * @Version 1.0
 */
public class TxtPropertySourceLoader implements PropertySourceLoader {


    private PropertiesPropertySourceLoader propertiesPropertySourceLoader = new PropertiesPropertySourceLoader();

    @Override
    public String[] getFileExtensions() {
        return new String[]{"txt"};
    }

    @Override
    public List<PropertySource<?>> load(String name, Resource resource) throws IOException {
        //在这里这样操作因为OriginTrackedPropertiesLoader这个类不是公共的，所以这样操作是为了方便测试，不然要编写一堆代码去处理
        return propertiesPropertySourceLoader.load(name, resource);
    }


}
