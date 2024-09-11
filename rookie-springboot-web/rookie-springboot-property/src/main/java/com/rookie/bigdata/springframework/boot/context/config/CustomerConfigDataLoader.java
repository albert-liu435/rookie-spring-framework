package com.rookie.bigdata.springframework.boot.context.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rookie.bigdata.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.context.config.ConfigData;
import org.springframework.boot.context.config.ConfigDataLoader;
import org.springframework.boot.context.config.ConfigDataLoaderContext;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @Class CustomerConfigDataLoader
 * @Description
 * @Author rookie
 * @Date 2024/9/6 14:49
 * @Version 1.0
 */
@Slf4j
public class CustomerConfigDataLoader implements ConfigDataLoader<CustomerConfigDataResource> {

    private ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    private ObjectMapper objectMapper = new ObjectMapper();
    ConfigData.PropertySourceOptions NONE = ConfigData.PropertySourceOptions.ALWAYS_NONE;
    @Override
    public ConfigData load(ConfigDataLoaderContext context, CustomerConfigDataResource resource) throws IOException, ConfigDataResourceNotFoundException {
        final List<PropertySource<?>> composite = new ArrayList<>();
        String resourceName = resource.getResourceName();
        Resource[] resources = resolver.getResources("classpath:".concat(resourceName));
        File file = resources[0].getFile();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        Map<String, Object> map = objectMapper.readValue(sb.toString(), Map.class);
        map.entrySet().forEach(entry -> {
            composite.add(new MapPropertySource(entry.getKey(), Collections.<String, Object>singletonMap(entry.getKey(), entry.getValue())));
        });
        return new ConfigData(composite, NONE);
    }
}
